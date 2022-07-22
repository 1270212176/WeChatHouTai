package com.cyxy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cyxy.entity.Category;
import com.cyxy.entity.CyFoods;
import com.cyxy.entity.ResponseResult;
import com.cyxy.entity.vo.CategoryVo;
import com.cyxy.entity.vo.CyFoodsVo;
import com.cyxy.mapper.CategoryMapper;
import com.cyxy.mapper.FoodsMapper;
import com.cyxy.service.CategoryService;

import com.cyxy.utils.BeanCopyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    @Resource
    private FoodsMapper foodsMapper;


    @Override
    public ResponseResult findCategory() {
        List<Category> categories = categoryMapper.selectList(null);

        return ResponseResult.okResult(categories);
    }

    @Override
    public ResponseResult findCategoryById(Integer id) {

        List<CategoryVo> cateFoods = foodsMapper.findCateFoods(id);


        return ResponseResult.okResult(cateFoods);
    }
}
