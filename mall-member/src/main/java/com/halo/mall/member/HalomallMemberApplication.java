package com.halo.mall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.halo.mall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class HalomallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(HalomallMemberApplication.class, args);
    }

}
