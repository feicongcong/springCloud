package com.SpringCloudAll.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description: eureka服务
 * @Author: CC.F
 * @Date:
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(EurekaBootstrap.class, args);
    }

}
