package com.aaron.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liuwenchao
 * @create 2020-06-13 21:14
 **/
@SpringBootApplication
@EnableFeignClients
public class OrderHystrixMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain8001.class,args);
    }
}
