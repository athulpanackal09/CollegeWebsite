package com.learn.education.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.education.entities.Users;


public interface UsersRepository extends JpaRepository<Users, String> {

	public Users findByEmail(String email);
	public Users findByUsername(String name);
}
