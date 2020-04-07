package com.ashish.user.login.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashish.user.login.dto.enitity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
