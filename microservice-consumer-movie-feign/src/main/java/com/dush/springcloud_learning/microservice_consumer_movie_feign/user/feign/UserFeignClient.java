package com.dush.springcloud_learning.microservice_consumer_movie_feign.user.feign;

import com.dush.springcloud_learning.microservice_consumer_movie_feign.user.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Chopper on 2018/4/25.
 */
@FeignClient("microservice-provider-user")
public interface UserFeignClient {
    @RequestMapping(value="/{id}",method= RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);
}
