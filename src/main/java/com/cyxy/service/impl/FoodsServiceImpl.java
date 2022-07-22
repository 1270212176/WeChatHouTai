package com.cyxy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cyxy.entity.CyFoods;
import com.cyxy.entity.ResponseResult;
import com.cyxy.entity.vo.CyFoodsVo;
import com.cyxy.entity.vo.PageVo;
import com.cyxy.mapper.FoodsMapper;
import com.cyxy.service.FoodsService;
import com.cyxy.service.ImageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class FoodsServiceImpl extends ServiceImpl<FoodsMapper, CyFoods> implements FoodsService {

    @Resource
    private FoodsMapper foodsMapper;

    @Resource
    private ImageService imageService;


    @Override
    public ResponseResult findResFoods(Integer pageSize) {

        Page<CyFoodsVo> page = new Page<>();
        page.setCurrent(1);
        page.setSize(pageSize);
        foodsMapper.findResFoods(page);
        List<CyFoodsVo> resFoods = page.getRecords();
        return ResponseResult.okResult(resFoods);
    }

    @Override
    public ResponseResult findSearchFoods(Integer pageSize, String keywords, Integer page) {
        System.out.println(keywords);
        if(Objects.isNull(keywords)){
            Page<CyFoodsVo> pages = new Page<>();
            pages.setCurrent(1);
            pages.setSize(6);
            foodsMapper.findResFoods(pages);
            List<CyFoodsVo> resFoods = pages.getRecords();
            return ResponseResult.okResult(resFoods);
        }
        LambdaQueryWrapper<CyFoods> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(CyFoods::getName,keywords);
        Page<CyFoods> page1 = new Page<>(page,pageSize);
        page(page1,queryWrapper);
        List<CyFoods> records = page1.getRecords();

        records.stream()
                .map(new Function<CyFoods, Object>() {
                    @Override
                    public Object apply(CyFoods cyFoods) {
                        cyFoods.setUrl(imageService.getById(cyFoods.getUid()).getUrl());
                        return cyFoods;
                    }
                })
                .collect(Collectors.toList());


        PageVo pageVo = new PageVo(records,page1.getTotal(),pageSize,page);


        return ResponseResult.okResult(pageVo);
    }
}
