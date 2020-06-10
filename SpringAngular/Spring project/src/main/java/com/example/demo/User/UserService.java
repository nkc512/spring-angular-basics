package com.example.demo.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private List<User> user= new ArrayList<>(Arrays.asList(
			new User("1","Nk","nk@gmail.com",new String[] {"C++,'JAVA"}),
			new User("2","sdf","sdfsdf", new String[] {"Python"})));
		
}
