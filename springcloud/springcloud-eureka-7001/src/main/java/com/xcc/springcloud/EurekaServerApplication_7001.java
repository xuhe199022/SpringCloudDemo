package com.xcc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xuhe
 * @PackageName:com.xcc.springcloud
 * @ClassName:EurekaServerApplication_7001
 * @Description:
 * @data 2022/4/13 17:12
 */
@SpringBootApplication
@EnableEurekaServer //是一个服务端启动类，可以接受别人注册进来
public class EurekaServerApplication_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication_7001.class,args);
    }
}
