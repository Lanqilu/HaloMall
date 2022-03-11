package com.halo.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.halo.common.utils.PageUtils;
import com.halo.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author Halo
 * @email 885240677@qq.com
 * @date 2021-03-18 18:59:24
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

