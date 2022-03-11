package com.halo.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.halo.common.utils.PageUtils;
import com.halo.mall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author Halo
 * @email 885240677@qq.com
 * @date 2021-03-18 19:36:10
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

