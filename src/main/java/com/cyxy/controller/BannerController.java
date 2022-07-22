package com.cyxy.controller;

import com.cyxy.entity.ResponseResult;
import com.cyxy.service.BannerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/banner")
public class BannerController {

    @Resource
    private BannerService bannerService;

    @GetMapping("/gets")
    public ResponseResult getBanner(){
        return bannerService.getBanner();
    }

}
