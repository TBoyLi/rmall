package com.redli.rmall.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import com.redli.rmall.common.config.BaseSwaggerConfig;
import com.redli.rmall.common.domain.SwaggerProperties;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 *
 * @author redli
 * @date 2022/9/9
 */
@Configuration
@EnableSwagger2
@EnableKnife4j
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.redli.rmall.controller")
                .title("rmall后台系统")
                .description("rmall后台相关接口文档")
                .contactName("redli")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }

    @Bean
    public BeanPostProcessor springfoxHandlerProviderBeanPostProcessor() {
        return generateBeanPostProcessor();
    }

}
