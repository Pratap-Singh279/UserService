package com.flightapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.bean.User;
import com.flightapp.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/user/registration/")
	public String registration(@RequestBody User user) {
		String status = userService.register(user);
		if (status == null) {
			throw new RuntimeException("Kuch to gadbad kiya");
		}
		return status;
	}

}
