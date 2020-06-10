package com.example.demo.User;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private String id;
	private String name;
	private String email;
	private String skills[];
	public User()
	{
		
	}
	public User(String id, String name, String email, String[] skills) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.skills = skills;
	}
	public User(String id, String name, String email) {
		this.id=id;
		this.name=name;
		this.email=email;
	}
	
	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
