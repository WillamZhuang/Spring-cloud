package com.dush.springcloud_learning.microservice_consumer_movie_feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Chopper on 2018/4/23.
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class ConsumerMovieApplication {
    public static void main(String[] args){
        SpringApplication.run(ConsumerMovieApplication.class,args);
    }
}
