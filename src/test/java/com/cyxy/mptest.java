package com.cyxy;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cyxy.entity.CyFoods;
import com.cyxy.entity.vo.CategoryVo;
import com.cyxy.entity.vo.CyFoodsVo;
import com.cyxy.entity.vo.FoodsInfoVo;
import com.cyxy.mapper.FoodsInfoMapper;
import com.cyxy.mapper.FoodsMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class mptest {

    @Resource
    private FoodsMapper foodsMapper;

    @Resource
    private FoodsInfoMapper foodsInfoMapper;

    @Test
    public void test(){
        CyFoods cyFoods = foodsMapper.find();
        System.out.println(cyFoods);
    }

    @Test
    public void test1(){
        Page<CyFoodsVo> page = new Page<>();
        page.setSize(2);
        //设置当前页码
        page.setCurrent(2);
        foodsMapper.findResFoods(page);
        System.out.println(page.getRecords());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
    }

    @Test
    public void test2(){
        List<CategoryVo> cateFoods = foodsMapper.findCateFoods(1);
        System.out.println(cateFoods);
    }

    @Test
    public void test3(){
        List<FoodsInfoVo> foodsContent = foodsInfoMapper.findFoodsContent(18);
        System.out.println(foodsContent);
    }
}
