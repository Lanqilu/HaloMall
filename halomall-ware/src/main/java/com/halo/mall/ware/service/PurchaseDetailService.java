package com.halo.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.halo.common.utils.PageUtils;
import com.halo.mall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * @author Halo
 * @email 885240677@qq.com
 * @date 2021-03-18 19:58:35
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

