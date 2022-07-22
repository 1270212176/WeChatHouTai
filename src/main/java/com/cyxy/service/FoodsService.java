package com.cyxy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cyxy.entity.CyFoods;
import com.cyxy.entity.ResponseResult;
import com.cyxy.entity.vo.CyFoodsVo;

public interface FoodsService extends IService<CyFoods> {
    public ResponseResult findResFoods(Integer pageSize);

    ResponseResult findSearchFoods(Integer pageSize, String keywords, Integer page);
}
