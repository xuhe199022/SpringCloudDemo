package com.xcc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author xuhe
 * @PackageName:com.xcc.springcloud
 * @ClassName:springcloud_zuul
 * @Description:
 * @data 2022/4/16 22:01
 */
@SpringBootApplication
@EnableZuulProxy // 开启Zuul
public class Springcloud_zuul {
    public static void main(String[] args) {
        SpringApplication.run(Springcloud_zuul.class,args);
    }
}
