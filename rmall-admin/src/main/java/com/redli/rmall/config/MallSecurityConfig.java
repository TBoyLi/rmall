package com.redli.rmall.config;

import com.redli.rmall.model.UmsResource;
import com.redli.rmall.security.component.DynamicSecurityService;
import com.redli.rmall.service.UmsAdminService;
import com.redli.rmall.service.UmsResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * mall-security模块相关配置
 *
 * @author redli
 * @date 2022/9/9
 */
@Configuration
public class MallSecurityConfig {

    @Autowired
    private UmsAdminService adminService;
    @Autowired
    private UmsResourceService resourceService;

    /**
     * 用户信息 UserDetails
     * @return
     */
    @Bean
    public UserDetailsService userDetailsService() {
        /**
         *    return username -> adminService.loadUserByUsername(username); 等同于下面代码
         *    return new UserDetailsService() {
         *             @Override
         *             public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
         *                 return adminService.loadUserByUsername(username);
         *             }
         *         };
         */
        //获取登录用户信息
        return username -> adminService.loadUserByUsername(username);
    }

    /**
     * 动态权限相关业务类 加载所有资源ANT通配符和资源对应MAP 对应数据表 ums_resource
     * @return DynamicSecurityService
     */
    @Bean
    public DynamicSecurityService dynamicSecurityService() {
        return new DynamicSecurityService() {
            @Override
            public Map<String, ConfigAttribute> loadDataSource() {
                Map<String, ConfigAttribute> map = new ConcurrentHashMap<>();
                List<UmsResource> resourceList = resourceService.listAll();
                for (UmsResource resource : resourceList) {
                    map.put(resource.getUrl(), new org.springframework.security.access.SecurityConfig(resource.getId() + ":" + resource.getName()));
                }
                return map;
            }
        };
    }
}
