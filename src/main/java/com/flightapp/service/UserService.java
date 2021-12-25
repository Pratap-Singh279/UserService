package com.flightapp.service;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.bean.Role;
import com.flightapp.bean.User;
import com.flightapp.constant.FlightConstant;

@Service
@Transactional
public class UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	public String register(User user) {
		user.setRegisteredTime(LocalDateTime.now());
		Optional<Role> role = roleRepository.findById(2001);
		if (!role.isPresent()) {
			return null;
		}

		user.addRole(role.get());
		userRepository.save(user);

		return FlightConstant.REGISTRATION_SUCCESS;
	}
}
