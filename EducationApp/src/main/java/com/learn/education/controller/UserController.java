package com.learn.education.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learn.education.entities.Users;
import com.learn.education.services.UserService;

import jakarta.servlet.http.HttpSession;


@Controller
public class UserController {

	@Autowired
	UserService userv;
	
	@PostMapping("/register")
	public String addUser(@ModelAttribute Users user) 
	{

		boolean userstatus = userv.emailExists(user.getEmail());
		if(userstatus == false)
		{
			userv.addUser(user);
			System.out.println("User is added");
			return "login";
		}

		else
		{
			System.out.println("User is already exist");
			return "registerfail";
		}



	}

	@PostMapping("/login")
	public String validateUser(@RequestParam String email, @RequestParam String password) {
	    if (!userv.emailExists(email)) {
	        return "loginfail";
	    }

	    if (userv.validateUser(email, password)) {
	        return "loginsuccess";
	    
	    } else {
	        return "loginfail";
	    }
	}

	
}
