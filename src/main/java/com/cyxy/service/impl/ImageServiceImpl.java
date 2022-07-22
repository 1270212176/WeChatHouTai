package com.cyxy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cyxy.entity.ImageInfo;
import com.cyxy.mapper.ImageInfoMapper;
import com.cyxy.service.ImageService;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl extends ServiceImpl<ImageInfoMapper, ImageInfo> implements ImageService {
}
