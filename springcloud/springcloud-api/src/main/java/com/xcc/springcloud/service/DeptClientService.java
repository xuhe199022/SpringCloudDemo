package com.xcc.springcloud.service;

import com.xcc.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallBackFactory.class)//fallbackFactory指定降级配置类
public interface DeptClientService {
    @GetMapping("/dept/queryByNo/{id}")
    public Dept queryById(@PathVariable("id") Long id);

    @GetMapping("/dept/queryAll")
    public  List<Dept> queryAll();

    @PostMapping("/dept/add")
    public Boolean addDept(Dept dept);
}
