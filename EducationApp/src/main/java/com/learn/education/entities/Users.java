package com.learn.education.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {

	
	@Id
	String email;
	String username;
	String password;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Users [username=" + username + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
