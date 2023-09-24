package com.app.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.user.repository.UserRepository;
import com.app.user.util.User;
import com.app.user.util.UserPojo;
import com.google.gson.Gson;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	Gson  gson = new Gson();
	String u;
	@Override
	public String getUser(Integer id) {
		/*
		 * UserPojo userPojo; Optional<User> user = userRepository.findById(id);
		 * 
		 * if(user.isPresent()) u = gson.toJson(user.get()); userPojo = gson.fromJson(u,
		 * UserPojo.class); return userPojo;
		 */
		
		return "hello";
	}
}
