package com.aaron.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author liuwenchao
 * @create 2020-06-09 23:18
 **/
@Configuration
public class ApplicationContextConfig {


    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
