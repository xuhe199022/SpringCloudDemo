package com.xcc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xuhe
 * @PackageName:com.xcc.springcloud
 * @ClassName:DeptConsumerApplication_80
 * @Description:
 * @data 2022/4/13 0:16
 */
@SpringBootApplication
@EnableEurekaClient //开启Eureka 客户端 Ribbon整合后，不用关心端口
public class DeptConsumerApplication_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApplication_80.class,args);
    }
}
