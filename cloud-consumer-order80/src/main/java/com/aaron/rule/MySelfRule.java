package com.aaron.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liuwenchao
 * @create 2020-06-11 23:13
 **/
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return new RoundRobinRule();
    }

}
