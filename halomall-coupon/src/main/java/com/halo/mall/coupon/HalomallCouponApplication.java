package com.halo.mall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@MapperScan("com.halo.mall.coupon.dao")
@SpringBootApplication
public class HalomallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(HalomallCouponApplication.class, args);
    }

}
