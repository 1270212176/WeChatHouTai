package com.cyxy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cyxy.entity.CyBanner;
import com.cyxy.entity.ResponseResult;

public interface BannerService extends IService<CyBanner> {
    ResponseResult getBanner();
}
