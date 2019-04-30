package com.javaJunitLoginDemo.service;

import java.util.List;

import com.javaJunitLoginDemo.entity.UserLogin;

public interface UserLoginService {

	// Login (Email/Password)
	// Get user from email
	// find users by state
	// find users by zip code
	
	public boolean login(UserLogin user);
	public UserLogin getUserByEmail(String email);
	public List<UserLogin> findUserByState(String state);
	public List<UserLogin> findUserByZipCode(String zipCode);
	
	public void createUsers(); // one way 
	public void createUser(UserLogin inputUserLogin); // another way
	
	public void deleteUser(int id);
}
