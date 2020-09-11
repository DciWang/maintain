package com.dciwang.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
//扫描mbg生成的mapper和自己定义的mapper文件
@MapperScan ({"com.dciwang.mbg.mapper","com.dciwang.reset.*.mapper"})
public class MyBatisConfig {
}
