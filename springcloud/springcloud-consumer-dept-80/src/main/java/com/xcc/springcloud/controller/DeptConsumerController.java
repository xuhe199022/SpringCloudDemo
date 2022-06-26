package com.xcc.springcloud.controller;

import com.xcc.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author xuhe
 * @PackageName:com.xcc.springcloud.controller
 * @ClassName:DeptConsumerController
 * @Description:
 * @data 2022/4/12 23:59
 */

@RestController
public class DeptConsumerController {
    //RestTemlpate 供我们调用 需要把它注册到spring中
    // url Class<T> responseType, Map<String, ?> uriVariables
    @Autowired
    private RestTemplate restTemplate; //提供远程访问http方法，简单的rest服务模板

    //请求服务方地址
    //Ribbon:我们这里的地址，应该是一个变量，通过服务名来访问
    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept getById(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/queryByNo/"+id,Dept.class);
    }
    @RequestMapping("/consumer/dept/getAll")
    public List<Dept> getAll(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/queryAll",List.class);
    }
    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }
}
