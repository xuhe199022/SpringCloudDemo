package com.xcc.springcloud.service;

import com.xcc.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author xuhe
 * @PackageName:com.xcc.springcloud.service
 * @ClassName:DeptClientServiceFallBackFactory
 * @Description:
 * @data 2022/4/15 23:10
 *  Hystrix服务降级 ~
 */
@Component
public class DeptClientServiceFallBackFactory  implements FallbackFactory {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept queryById(Long id) {
                return new Dept()
                        .setDeptNo(id)
                        .setDeptName("id=>" + id + "没有对应的信息，客户端提供了降级的信息，这个服务现在已经被关闭")
                        .setDb_source("没有数据~");
            }
            @Override
            public List<Dept> queryAll() {
                return null;
            }
            @Override
            public Boolean addDept(Dept dept) {
                return false;
            }
        };
    }
}
