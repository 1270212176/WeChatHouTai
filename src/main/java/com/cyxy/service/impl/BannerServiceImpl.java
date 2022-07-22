package com.cyxy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cyxy.entity.CyBanner;
import com.cyxy.entity.ResponseResult;
import com.cyxy.mapper.BannerMapper;
import com.cyxy.service.BannerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BannerServiceImpl extends ServiceImpl<BannerMapper, CyBanner> implements BannerService {

    @Resource
    private BannerMapper bannerMapper;

    @Override
    public ResponseResult getBanner() {
        List<CyBanner> cyBanners = bannerMapper.selectList(null);
        return ResponseResult.okResult(cyBanners);
    }
}
