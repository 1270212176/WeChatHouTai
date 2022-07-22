package com.cyxy.controller;

import com.cyxy.entity.ResponseResult;
import com.cyxy.service.FoodsInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/foodsInfo")
public class FoodsInfoController {

    @Resource
    private FoodsInfoService foodsInfoService;

    @GetMapping("/content/{id}")
    public ResponseResult findFoodsContent(@PathVariable Integer id){
        return foodsInfoService.findFoodsContent(id);
    }

}
