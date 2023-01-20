package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.dto.ResponseDto;
import com.ecommerce.project.dto.SignInDto;
import com.ecommerce.project.dto.SignInResponseDto;
import com.ecommerce.project.entity.User;
import com.ecommerce.project.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	//two apis
	
	/** signup */
	
	@PostMapping("/signup")
	public User signup(@RequestBody User user) {
		 userService.signUp(user);
		 return user;
	}
	
	/** Signin  */
	@PostMapping("/signin")
	public SignInResponseDto signIn(@RequestBody SignInDto signInDto) {
		return userService.signIn(signInDto);
	}
	
}
