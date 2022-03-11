package com.halo.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.halo.common.utils.PageUtils;
import com.halo.mall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author Halo
 * @email 885240677@qq.com
 * @date 2021-03-18 19:52:38
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

