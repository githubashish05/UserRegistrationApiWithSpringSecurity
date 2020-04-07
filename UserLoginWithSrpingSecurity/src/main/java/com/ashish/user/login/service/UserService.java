package com.ashish.user.login.service;

import org.springframework.stereotype.Service;

import com.ashish.user.login.dto.UserDto;

@Service
public interface UserService {
    public UserDto createUser(UserDto user);
}
