package com.xcc.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author xuhe
 * @PackageName:com.xcc.springcloud.pojo
 * @ClassName:Dept
 * @Description:
 * @data 2022/4/12 22:25
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)//链式写法
public class Dept implements Serializable {
    private Long deptNo;
    private String deptName;
    //同一个信息可能存在不同数据库
    private String db_source;
    public Dept(String deptName){
        this.deptName = deptName;
    }
}
