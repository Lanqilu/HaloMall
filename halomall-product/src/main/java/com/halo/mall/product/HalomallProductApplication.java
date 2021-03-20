package com.halo.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.halo.mall.product.dao")
@SpringBootApplication
public class HalomallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(HalomallProductApplication.class, args);
    }

}
