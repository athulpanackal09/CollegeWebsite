package com.learn.education.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.education.entities.Users;
import com.learn.education.repositories.UsersRepository;


@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	UsersRepository repo;

	@Override
	public String addUser(Users user) {

		repo.save(user);
		return "user is created and saved";
	}

	@Override
	public boolean emailExists(String username) {
		// TODO Auto-generated method stub
		if(repo.findByUsername(username)==null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	@Override
	public boolean validateUser(String email, String password) 
	{

		Users user = repo.findByEmail(email);
		String db_password = user.getPassword();
		if(db_password.equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}

	}
}
