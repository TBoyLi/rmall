package com.redli.rmall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 * Created by redli on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.redli.rmall.mapper","com.redli.rmall.dao"})
public class MyBatisConfig {
}
