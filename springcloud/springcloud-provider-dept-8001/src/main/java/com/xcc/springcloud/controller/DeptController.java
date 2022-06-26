package com.xcc.springcloud.controller;

import com.xcc.springcloud.pojo.Dept;
import com.xcc.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author xuhe
 * @PackageName:com.xcc.springcloud.controller
 * @ClassName:DeptController
 * @Description:
 * @data 2022/4/12 23:15
 */
@RestController
public class DeptController {
    /**
     * DiscoveryClient 可以用来获取一些配置的信息，得到具体的微服务！
     */
    @Autowired
    private DiscoveryClient client;

    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/queryByNo/{id}")
    public Dept queryById(@PathVariable("id") Long deptNo) {
        return deptService.queryById(deptNo);
    }

    @GetMapping("/dept/queryAll")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }

    @PostMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    /*获取一些注册进来的微服务的信息~，
     *
     * @return
     */
    @GetMapping("/dept/discovery")
    public Object discovery() {
        // 获取微服务列表的清单
        List<String> services = client.getServices();
        System.out.println("discovery=>services:" + services);
        // 得到一个具体的微服务信息,通过具体的微服务id，applicaioinName；
        List<ServiceInstance> instances = client.getInstances("springcloud-provider-dept");
        for (ServiceInstance instance : instances) {
            System.out.println(
                    instance.getHost() + "\t" + // 主机名称
                            instance.getPort() + "\t" + // 端口号
                            instance.getUri() + "\t" + // uri
                            instance.getServiceId() // 服务id
            );
        }
        return this.client;
    }
}
