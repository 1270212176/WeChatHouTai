package com.cyxy.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodsInfoVo {
    private Integer id;
    private String name;
    private double price;
    private Integer stock;
    private Integer uid;
    private Integer gid;
    private Integer type;
    private String url;
    private String cname;
    private String content;
    private String taste;
}
