package com.flightapp.bean;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

	@Id
	@GeneratedValue
	private Integer userId;

	private String firstName;
	private String lastName;
	private String email;
	private String password;

	@ManyToMany
	private Set<Role> roles = new HashSet<>();

	private LocalDateTime registeredTime;

	public User(String firstName, String lastName, String email, String password, LocalDateTime registeredTime) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.registeredTime = registeredTime;
	}

	public void addRole(Role role) {
		this.roles.add(role);
	}

}
