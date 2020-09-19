package com.atguigu.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.alibaba.domain
 * @ClassName: Storage
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/9/18 19:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage {
    private Long id;

    private Integer total;

    private Long productId;

    private Integer used;

    private Integer residue;
}
