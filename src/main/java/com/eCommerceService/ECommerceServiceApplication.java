package com.eCommerceService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ECommerceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ECommerceServiceApplication.class, args);
    }

}
