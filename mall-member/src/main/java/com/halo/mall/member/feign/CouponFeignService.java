package com.halo.mall.member.feign;

import com.halo.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Halo
 * @Create 2021-03-18 下午 08:46
 * @Description
 */

@FeignClient("halomall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();

}