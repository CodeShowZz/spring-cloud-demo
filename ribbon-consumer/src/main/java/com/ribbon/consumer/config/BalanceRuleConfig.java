package com.ribbon.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author junlin_huang
 * @create 2021-06-03 2:45 AM
 **/

@Configuration
@RibbonClient(name = "hello-service",configuration = BalanceRuleConfig.class)
public class BalanceRuleConfig {

    @Bean
    public IRule rule() {
        return new RandomRule();
    }
}