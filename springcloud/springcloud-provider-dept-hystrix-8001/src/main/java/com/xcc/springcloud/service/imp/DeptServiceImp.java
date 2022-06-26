package com.xcc.springcloud.service.imp;

import com.xcc.springcloud.mapper.DeptMapper;
import com.xcc.springcloud.pojo.Dept;
import com.xcc.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuhe
 * @PackageName:com.xcc.springcloud.service.imp
 * @ClassName:DeptServiceImp
 * @Description:
 * @data 2022/4/12 23:12
 */
@Service
public class DeptServiceImp implements DeptService {

    @Autowired
    private DeptMapper deptMapper;
    @Override
    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptMapper.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptMapper.queryAll();
    }
}
