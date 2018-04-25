package com.dush.springcloud_learning.microservice_consumer_movie_ribbon_customizing.study.config;

import com.dush.springcloud_learning.microservice_consumer_movie_ribbon_customizing.config.RibbonConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Jobba on 2018/4/24.
 */
@Configuration
@RibbonClient(name="microservice-provider-user",configuration=RibbonConfiguration.class)
public class TestConfiguration{
}
