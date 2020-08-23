package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.entities
 * @ClassName: Payment
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/8/22 22:19
 */
@Data  //getter  setter
@AllArgsConstructor //全参构造
@NoArgsConstructor   //空参构造
public class Payment {
    private Long id;
    private String serial;
}
