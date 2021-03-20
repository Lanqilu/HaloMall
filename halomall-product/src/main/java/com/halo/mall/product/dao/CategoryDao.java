package com.halo.mall.product.dao;

import com.halo.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Halo
 * @email 885240677@qq.com
 * @date 2021-03-18 18:59:23
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
