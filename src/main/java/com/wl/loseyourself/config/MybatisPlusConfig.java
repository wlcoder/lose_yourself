package com.wl.loseyourself.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: wl
 * @Date: 2020/4/26 14:58
 * @Description: mp配置
 */
@Configuration
public class MybatisPlusConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");
        return page;
    }

    @Bean
    public PerformanceInterceptor performanceInterceptor() {
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        //maxTime 指的是 sql 最大执行时长
        performanceInterceptor.setMaxTime(10000);
        //SQL是否格式化 默认false
        performanceInterceptor.setFormat(true);
        return performanceInterceptor;
    }
}