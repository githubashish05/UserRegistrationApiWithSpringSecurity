package com.ashish.user.login.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashish.user.login.dto.UserDto;
import com.ashish.user.login.dto.enitity.UserEntity;
import com.ashish.user.login.repository.UserRepository;
import com.ashish.user.login.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public UserDto createUser(UserDto user) {
		
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		
		String userId = "1000";
		userEntity.setUserId(userId);
		
		String encryptedPassword = "encrypted password..";
		userEntity.setEncryptedPassword(encryptedPassword);
		
		userRepository.save(userEntity);
		
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userEntity, userDto);
		
		return userDto;
	}
}
