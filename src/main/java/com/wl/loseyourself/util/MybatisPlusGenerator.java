package com.wl.loseyourself.util;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MybatisPlusGenerator {

    public static void main(String[] args) {
        String packageName = "com.wl.loseyourself";
        // user -> UserService, 为true: user -> IUserService
        boolean serviceNameStartWithI = false;
        generateByTables(serviceNameStartWithI, packageName, "sys_user", "sys_role", "sys_permission", "sys_user_role", "sys_role_permission");
    }

    private static void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        String dbUrl = "jdbc:mysql://localhost:3306/lose_yourself?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setTypeConvert(new MySqlTypeConvert() {
            // 自定义数据库表字段类型转换【可选】
            @Override
            public DbColumnType processTypeConvert(String fieldType) {
                System.out.println("转换类型：" + fieldType);
                return super.processTypeConvert(fieldType);
            }
        });
        dataSourceConfig.setDbType(DbType.MYSQL).setUrl(dbUrl).setUsername("root").setPassword("root").setDriverName("com.mysql.cj.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true).setEntityLombokModel(false)
                // .setDbColumnUnderline(true)
                // 采用驼峰策略
                .setNaming(NamingStrategy.underline_to_camel).setInclude(tableNames);

        config.setActiveRecord(false).setAuthor("wl")
                // 输出位置
                .setOutputDir("F:\\java_projects\\mp_info")
                .setFileOverride(true);
        if (!serviceNameStartWithI) {
            config.setServiceName("%sService");
        }
        new AutoGenerator().setGlobalConfig(config).setDataSource(dataSourceConfig).setStrategy(strategyConfig)
                .setPackageInfo(new PackageConfig().setParent(packageName).setController("controller").setEntity("entity"))
                .execute();
    }

}