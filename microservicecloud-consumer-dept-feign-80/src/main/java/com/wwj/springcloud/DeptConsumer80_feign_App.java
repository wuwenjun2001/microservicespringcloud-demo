package com.wwj.springcloud;

import com.wwj.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.wwj.springcloud.service"})

//这里调用MICROSERVICECLOUD-DEPT服务将采用MySelfRule指定的负载均衡策略，其他服务继续采用默认的轮询策略
//注意：MySelfRule不能放在当前启动类主配置文件所在包下，避免被扫描到，否则本进程的所有客户端调用，均采用此负载均衡策略
@RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = MySelfRule.class)
public class DeptConsumer80_feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_feign_App.class, args);
    }
}
