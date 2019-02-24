package com.SpringCloudAll.zuul;

import com.SpringCloudAll.feign.common.component.SpringComponent;
import com.SpringCloudAll.feign.common.config.JsonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @Description: 网关服务
 * @Author: CC.F
 * @Date:
 */
@EnableAutoConfiguration
@EnableHystrixDashboard
@ComponentScan(basePackages = {
        "com.SpringCloudAll.zuul",
        "com.SpringCloudAll.feign"
})
@EnableFeignClients({"com.SpringCloudAll.feign"})
@Import({
        // json配置
        JsonConfig.class
})
@EnableZuulProxy
@SpringCloudApplication
public class ZuulBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(ZuulBootstrap.class, args);
    }


}
