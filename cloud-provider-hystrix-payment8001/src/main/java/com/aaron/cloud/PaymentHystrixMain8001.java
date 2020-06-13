package com.aaron.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liuwenchao
 * @create 2020-06-13 21:01
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentHystrixMain8001 {


    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8001.class, args);
    }
}
