package com.dush.springcloud_learning.microservice_consumer_movie_feign_hystrix_fallback.user.feign;

import com.dush.springcloud_learning.microservice_consumer_movie_feign_hystrix_fallback.user.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Chopper on 2018/4/25.
 */
@FeignClient(name="microservice-provider-user",fallback=FeignClientFallback.class)
public interface UserFeignClient {
    @RequestMapping(value="/{id}",method= RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);
}
@Component
class FeignClientFallback implements UserFeignClient{
    public User findById(Long id){
        User user=new User();
        user.setId(-1L);
        user.setName("默认用户");
        return user;
    }
}
