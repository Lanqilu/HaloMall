package com.halo.mall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.halo.mall.order.dao")
@SpringBootApplication
public class HalomallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HalomallOrderApplication.class, args);
    }

}
