package com.example.demo.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired 
	UserJPAService userService;
	@RequestMapping("/users")
	public List<User> getAllusers()
	{
		return userService.getAllUser();
	}
	@RequestMapping("/users/{id}")
	public User getUser(@PathVariable String id)
	{
		return userService.getUser(id);
	}
	@RequestMapping("/adduser")
	public void addUsers(User user)
	{
		userService.addUser(user);
	}
	@RequestMapping(method=RequestMethod.POST,value="/adduser")
	public void addUser(@RequestBody User user)
	{
		userService.addUser(user);
	}
	
}
