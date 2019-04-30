package com.javaJunitLoginDemo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.javaJunitLoginDemo.entity.UserLogin;
import com.javaJunitLoginDemo.service.UserLoginDAOImple;
import com.javaJunitLoginDemo.service.UserLoginService;

public class UserLoginDAOImpleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testLogin() {
		// email = "kawsar@gmail.com"
		//password= "12345"
		// Before testing add the user to your table User
		
		// test  case 1: email = "kawsar@gmail.com", password = "12345"
		// step-1. Prepare expected values
			// testing for a valid login
		
		
		// step-2. Prepare or get actual values
		    // invoke the login with the test case data
		
		// test  case 1: email = "kawsar@gmail.com", password = "12345"
		UserLoginService us = new UserLoginDAOImple();
		UserLogin user = new UserLogin();
		user.setEmail("kawsar@gmail.com");
		user.setPassword("12345");
		boolean expected = us.login(user);
		//step-3. assert 
		// login should return true
		assertTrue(expected);
		
		// test  case 2: email = "kawsar@gmail.com", password = "12345"
				us = new UserLoginDAOImple();
			    user = new UserLogin();
				user.setEmail("kawsar@gmail.com");
				user.setPassword("12345hhhh");
				expected = us.login(user);
		//step-3. assert 
			// login should return true
		assertFalse(expected);
		
		
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetUserByEmail() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testFindUserByState() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testFindUserByZipCode() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testCreateUsers() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testCreateUser() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testDeleteUser() {
		fail("Not yet implemented"); // TODO
	}

}
