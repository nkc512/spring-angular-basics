package com.example.demo.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserJPAService {
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUser()
	{
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}
	/*
	public User getUser(String id)
	{
		try {
		Iterable<User> user=userRepository.
		}
		catch(Exception e)
		{
			return null;
		}
		
		return user;
	}*/
	public User getUser(String id)
	{
		return userRepository.findById(id).orElse(null);
	}

	
	public void deleteUser(User user,String id)
	{
		userRepository.deleteById(id);
	}
	public void updateUser(User user)
	{
		userRepository.save(user);
	}

	public void addUser(User user) {
		userRepository.save(user);
	}
}
