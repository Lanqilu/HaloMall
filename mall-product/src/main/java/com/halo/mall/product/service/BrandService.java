package com.halo.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.halo.common.utils.PageUtils;
import com.halo.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author Halo
 * @email 885240677@qq.com
 * @date 2021-03-18 18:59:23
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

