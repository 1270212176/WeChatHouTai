package com.cyxy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cyxy.entity.GoodsInfo;
import com.cyxy.entity.ResponseResult;

public interface FoodsInfoService extends IService<GoodsInfo> {
    ResponseResult findFoodsContent(Integer id);
}
