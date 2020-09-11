package com.dciwang.reset.config;

import com.dciwang.config.Swagger2Config;
import com.dciwang.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



/**
 * Swagger API文档相关配置
 * Created by macro on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends Swagger2Config {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.dciwang.reset.source.controller")
                .title("maintain后台系统")
                .description("maintain后台相关接口文档")
                .contactName("DciWang")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
