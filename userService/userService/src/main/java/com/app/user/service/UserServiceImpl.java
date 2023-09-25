package com.app.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.user.repository.UserRepository;
import com.app.user.util.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;


	public List<User> getUsers() {
		return userRepository.findAll();
	}
}
