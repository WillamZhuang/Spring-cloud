package com.dush.springcloud_learning.microservice_simple_provider_user.controller;

import com.dush.springcloud_learning.microservice_simple_provider_user.entity.User;
import com.dush.springcloud_learning.microservice_simple_provider_user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chopper on 2018/4/23.
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User findOne=this.userRepository.findOne(id);
        return findOne;
    }
}
