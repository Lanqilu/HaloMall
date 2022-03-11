package com.halo.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.halo.common.utils.PageUtils;
import com.halo.mall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author Halo
 * @email 885240677@qq.com
 * @date 2021-03-18 19:58:34
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

