package com.dciwang.reset;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author DciWang
 * @Description TODO  主启动类
 * @Date 2020/8/26 下午3:17
 * @Version 1.0
 */
//指定相同的packege
@SpringBootApplication(scanBasePackages = {"com.dciwang"})
public class ResetApplication {
    public static void main(String[] args) throws MalformedURLException {
        SpringApplication.run(ResetApplication.class,args);
        System.out.println("" +
                "-------------------------------------------------------------- \n" +
                "swaggerui:" + new URL("http://127.0.0.1:8090/swagger-ui.html  ")+"\n"+
                "--------------------------------------------------------------");
    }
}
