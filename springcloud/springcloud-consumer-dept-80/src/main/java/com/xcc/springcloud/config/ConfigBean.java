package com.xcc.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author xuhe
 * @PackageName:com.xcc.springcloud.config
 * @ClassName:ConfigBean
 * @Description:
 * @data 2022/4/13 0:02
 */
/**
 * IRule:
 * RoundRobinRule 轮询策略
 * RandomRule 随机策略
 * AvailabilityFilteringRule ： 会先过滤掉，跳闸，访问故障的服务~，对剩下的进行轮询~
 * RetryRule ： 会先按照轮询获取服务~，如果服务获取失败，则会在指定的时间内进行，重试
 */
@Configuration
public class ConfigBean {
    //Configration -- spring applicationContext.xml

    @LoadBalanced //配置负载均衡实现RestTemplate
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
        //return new RoundRobinRule();//使用轮询策略
        //return new AvailabilityFilteringRule();//使用轮询策略
        //return new RetryRule();//使用轮询策略
    }
}
