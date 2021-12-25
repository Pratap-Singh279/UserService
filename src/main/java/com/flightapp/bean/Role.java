package com.flightapp.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
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
public class Role {

	@Id
	private Integer roleId;
	private String roleName;

	@ManyToMany(mappedBy = "roles")
	private Set<User> users = new HashSet<>();

	public Role(Integer roleId, String roleName) {
		this.roleId = roleId;
		this.roleName = roleName;
	}

	public void addUser(User user) {
		this.users.add(user);	
	}

}
