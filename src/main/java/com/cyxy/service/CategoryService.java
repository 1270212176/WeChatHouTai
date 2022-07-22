package com.cyxy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cyxy.entity.Category;
import com.cyxy.entity.ResponseResult;

public interface CategoryService extends IService<Category> {
    ResponseResult findCategory();

    ResponseResult findCategoryById(Integer id);
}
