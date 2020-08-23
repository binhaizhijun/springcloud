package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.entities
 * @ClassName: CommonReslut
 * @Description: 返回给前端的通用json实体串
 * @Author: 滨海之君
 * @CreateDate: 2020/8/22 22:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonReslut<T> {
    private Integer code;
    private String message;
    private T data;

    /**
     * 当传给前端的data有时候为null,调用两个参数的构造
     * @param code
     * @param message
     */
    public CommonReslut(Integer code,String message){
        this(code,message,null);
    }
}
