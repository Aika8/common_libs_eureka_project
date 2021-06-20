package com.example.common_libs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.common_libs")
@EnableDiscoveryClient
public class CommonLibsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonLibsApplication.class, args);
    }

}
