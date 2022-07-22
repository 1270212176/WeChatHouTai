package com.cyxy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cyxy.entity.CyFoods;
import com.cyxy.entity.vo.CategoryVo;
import com.cyxy.entity.vo.CyFoodsVo;

import java.util.List;

public interface FoodsMapper extends BaseMapper<CyFoods> {
    public IPage<CyFoodsVo> findResFoods(Page<CyFoodsVo> page);
    public List<CategoryVo> findCateFoods(Integer id);
    public CyFoods find();
}
