package com.cyxy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cyxy.entity.GoodsInfo;
import com.cyxy.entity.ResponseResult;
import com.cyxy.entity.vo.FoodsInfoVo;
import com.cyxy.mapper.FoodsInfoMapper;
import com.cyxy.mapper.FoodsMapper;
import com.cyxy.service.FoodsInfoService;
import com.cyxy.service.FoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FoodsInfoServiceImpl extends ServiceImpl<FoodsInfoMapper,GoodsInfo> implements FoodsInfoService {

    @Resource
    private FoodsMapper foodsMapper;
    @Resource
    private FoodsInfoMapper foodsInfoMapper;

    @Override
    public ResponseResult findFoodsContent(Integer id) {
        List<FoodsInfoVo> foodsContent = foodsInfoMapper.findFoodsContent(id);
        return ResponseResult.okResult(foodsContent);
    }
}
