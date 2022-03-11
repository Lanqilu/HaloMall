package com.halo.mall.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HalomallThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(HalomallThirdPartyApplication.class, args);
    }

}
