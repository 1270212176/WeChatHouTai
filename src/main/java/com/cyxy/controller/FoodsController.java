package com.cyxy.controller;

import com.cyxy.entity.ResponseResult;
import com.cyxy.service.FoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/foods")
public class FoodsController {

    @Resource
    private FoodsService foodsService;

    @GetMapping("/res/{pageSize}")
    public ResponseResult findResFoods(@PathVariable("pageSize") Integer pageSize){
        ResponseResult responseResult = foodsService.findResFoods(pageSize);
        return responseResult;
    }

    @GetMapping("/search")
    public ResponseResult findSearchFoods(Integer pageSize,String keywords,Integer page){
        ResponseResult responseResult = foodsService.findSearchFoods(pageSize,keywords,page);
        return responseResult;
    }

}
