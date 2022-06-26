package com.xcc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xuhe
 * @PackageName:com.xcc.springcloud
 * @ClassName:DeptProviderApplication_8001
 * @Description:
 * @data 2022/4/12 23:20
 */
//启动类
@SpringBootApplication
@EnableEurekaClient // @EnableEurekaClient 开启Eureka客户端注解，在服务启动后自动向注册中心注册服务
@EnableDiscoveryClient //服务发现
public class DeptProviderApplication_8002 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderApplication_8002.class,args);
    }
}
