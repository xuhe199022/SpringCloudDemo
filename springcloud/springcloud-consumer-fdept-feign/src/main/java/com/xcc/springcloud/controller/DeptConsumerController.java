package com.xcc.springcloud.controller;

import com.xcc.springcloud.pojo.Dept;
import com.xcc.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept getById(@PathVariable("id") Long id){
        return deptClientService.queryById(id);
    }
    @RequestMapping("/consumer/dept/getAll")
    public List<Dept> getAll(){
        return deptClientService.queryAll();
    }

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
       return deptClientService.addDept(dept);
    }
}
