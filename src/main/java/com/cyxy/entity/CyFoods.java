package com.cyxy.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("cyfoods")
public class CyFoods {
    @TableId
    private Integer id;
    private String name;
    private double price;
    private Integer type;
    private Integer stock;
    private Integer uid;
    private Integer gid;

    @TableField(exist = false)
    private String url;
}
