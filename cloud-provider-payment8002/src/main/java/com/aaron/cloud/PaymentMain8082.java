package com.aaron.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liuwenchao
 * @create 2020-03-21 11:21
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8082 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8082.class, args);
    }
}
