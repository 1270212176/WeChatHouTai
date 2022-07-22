package com.cyxy.controller;

import com.cyxy.entity.ResponseResult;
import com.cyxy.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    @GetMapping("all")
    public ResponseResult findCategory(){
        return categoryService.findCategory();
    }

    @GetMapping("/{id}")
    public ResponseResult findCategoryById(@PathVariable Integer id)
    {
        return categoryService.findCategoryById(id);
    }

}
