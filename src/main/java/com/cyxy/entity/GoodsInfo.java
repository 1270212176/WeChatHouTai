package com.cyxy.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("cygoodsinfo")
public class GoodsInfo {
    @TableId
    private Integer id;
    private String content;
    private String taste;
}
