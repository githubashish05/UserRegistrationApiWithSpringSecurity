package com.ashish.user.login.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashish.user.login.dto.UserDto;
import com.ashish.user.login.request.model.UserDetailsRequestModel;
import com.ashish.user.login.responce.model.UserResponce;
import com.ashish.user.login.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	@GetMapping
	public String getUser()
	{
	   return "user are fetched..";	
	}
	
	@PostMapping
	public UserResponce saveUser(@RequestBody UserDetailsRequestModel user)
	{
	   UserDto userDto = new UserDto();
	   BeanUtils.copyProperties(user, userDto);
	   UserDto createdUser = userService.createUser(userDto);
	   
	   UserResponce userResponce = new UserResponce();
	   BeanUtils.copyProperties(createdUser, userResponce);
	   
	   return userResponce;	
	}
	
	@PutMapping
	public String updateUser()
	{
	   return "user are updated..";	
	}
	
	@DeleteMapping
	public String deleteUser()
	{
	   return "user are delete..";	
	}
}
