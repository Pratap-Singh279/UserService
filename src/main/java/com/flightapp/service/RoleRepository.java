package com.flightapp.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.bean.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
