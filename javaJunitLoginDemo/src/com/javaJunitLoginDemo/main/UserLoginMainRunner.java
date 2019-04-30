package com.javaJunitLoginDemo.main;

import com.javaJunitLoginDemo.entity.UserLogin;
import com.javaJunitLoginDemo.service.UserLoginDAOImple;
import com.javaJunitLoginDemo.service.UserLoginService;

public class UserLoginMainRunner {

	public static void main(String[] args) {
		
		System.out.println("User Application");
	
		// interface      ----------    implementation
		UserLoginService us =  new UserLoginDAOImple();
		UserLogin user =  new UserLogin();
		
		//us.createUsers(); // one way
		
		UserLogin userInput =  new UserLogin(); // another way
		userInput.setId(99);
		userInput.setAddress("Queens");
		userInput.setEmail("nkjkk@gmail.cm");
		userInput.setName("Mike");
		userInput.setPassword("118980");
		userInput.setState("NY");
		userInput.setZipCode("10001");
		
		us.createUser(userInput); // another way
		
		//us.deleteUser(5);
	
//		user.setEmail("m@live.com");
//		user.setPassword("123456");
//		if(us.login(user)) {
//			System.out.println("Welcome");
//		}else {
//			System.out.println("Bye bye");
//		}
	}

}
