package com.SpringCloudAll.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description: eureka服务端
 * @Author: CC.F
 * @Date:
 */
//该应用为eureka服务端
@EnableEurekaServer
@SpringBootApplication
public class EurekaBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(EurekaBootstrap.class, args);
    }
}
