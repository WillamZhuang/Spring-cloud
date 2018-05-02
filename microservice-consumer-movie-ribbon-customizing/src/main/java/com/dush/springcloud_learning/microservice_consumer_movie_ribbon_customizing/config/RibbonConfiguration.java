package com.dush.springcloud_learning.microservice_consumer_movie_ribbon_customizing.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Chopper on 2018/4/24.
 */
@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule ribbonRule(){
        //负载均衡规则，改为随机
        return new RandomRule();
    }
}
