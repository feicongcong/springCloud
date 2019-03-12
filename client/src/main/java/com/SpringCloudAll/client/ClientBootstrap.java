package com.SpringCloudAll.client;

import com.SpringCloudAll.feign.common.config.JsonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Description:
 * @Author: CC.F
 * @Date:
 */
@EnableAutoConfiguration
@EnableHystrixDashboard
@ComponentScan(basePackages = {
        "com.SpringCloudAll.client",
        "com.SpringCloudAll.feign"
})
@EnableFeignClients({"com.SpringCloudAll.feign"})
@Import({
        // json配置
        JsonConfig.class
})
@SpringCloudApplication
@EnableScheduling
//@RibbonClient(name = "business", configuration = RoundRobinRule.class)
public class ClientBootstrap {


    public static void main(String[] args) {

        SpringApplication.run(ClientBootstrap.class, args);
    }


}
