package com.redli.rmall.security.config;

import com.redli.rmall.common.config.BaseRedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * Redis配置类
 *
 * @author redli
 * @date 2022/9/9
 */
@EnableCaching
@Configuration
public class RedisConfig extends BaseRedisConfig {

}
