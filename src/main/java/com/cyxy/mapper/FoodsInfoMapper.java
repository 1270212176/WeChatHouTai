package com.cyxy.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cyxy.entity.GoodsInfo;
import com.cyxy.entity.vo.FoodsInfoVo;

import java.util.List;

public interface FoodsInfoMapper extends BaseMapper<GoodsInfo> {
    public List<FoodsInfoVo> findFoodsContent(Integer id);
}
