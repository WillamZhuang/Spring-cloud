package com.dush.springcloud_learning.microservice_consumer_movie_feign.study.user.controller;

import com.dush.springcloud_learning.microservice_consumer_movie_feign.study.user.feign.UserFeignClient;
import com.dush.springcloud_learning.microservice_consumer_movie_feign.study.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chopper on 2018/4/23.
 */
@RestController
public class MovieController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return this.userFeignClient.findById(id);
    }
}
