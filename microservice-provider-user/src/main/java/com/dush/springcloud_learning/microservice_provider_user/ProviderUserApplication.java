package com.dush.springcloud_learning.microservice_provider_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Chopper on 2018/4/23.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderUserApplication {
    public static void main(String args[]){
        SpringApplication.run(ProviderUserApplication.class,args);
    }
}
