package com.dush.springcloud_learning.microservice_provider_user_with_auth.repository;

import com.dush.springcloud_learning.microservice_provider_user_with_auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Jobba on 2018/4/23.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>{
}
