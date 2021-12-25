package com.flightapp.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.bean.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
