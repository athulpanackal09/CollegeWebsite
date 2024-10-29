package com.learn.education.services;

import com.learn.education.entities.Users;

public interface UserService {

public String addUser(Users user);
	
	public boolean emailExists(String email);
	
	public boolean validateUser(String email, String password);
}
