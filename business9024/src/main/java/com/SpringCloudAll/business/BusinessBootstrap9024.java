package com.SpringCloudAll.business;

import com.SpringCloudAll.feign.common.config.JsonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Description: 平台功能服务
 * @Author: J.W
 * @Date: 下午3:06 2018/9/13
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = {
        "com.SpringCloudAll.business",
        "com.SpringCloudAll.feign"
})
@EnableFeignClients({"com.SpringCloudAll.feign"})
@Import({
        // json配置
        JsonConfig.class,
})
@EnableAsync
@SpringBootApplication
//对Hystrix熔断机制的支持
@EnableCircuitBreaker
public class BusinessBootstrap9024 {

    public static void main(String[] args) {
        SpringApplication.run(BusinessBootstrap9024.class, args);
    }

}
