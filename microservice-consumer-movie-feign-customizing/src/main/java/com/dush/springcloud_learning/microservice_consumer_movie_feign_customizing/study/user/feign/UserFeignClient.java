package com.dush.springcloud_learning.microservice_consumer_movie_feign_customizing.study.user.feign;

import com.dush.springcloud_learning.microservice_consumer_movie_feign_customizing.config.FeignConfiguration;
import com.dush.springcloud_learning.microservice_consumer_movie_feign_customizing.study.user.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Jobba on 2018/4/25.
 */
@FeignClient(name="microservice-provider-user",configuration=FeignConfiguration.class,url="http://localhost:8000/")
public interface UserFeignClient {
    @RequestLine("GET /{id}")
    public User findById(@Param("id") Long id);
}
