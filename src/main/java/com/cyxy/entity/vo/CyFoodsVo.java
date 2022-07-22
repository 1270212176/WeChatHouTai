package com.cyxy.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CyFoodsVo {
    private Integer id;
    private String name;
    private double price;
    private Integer stock;
    private Integer uid;
    private String url;

}
