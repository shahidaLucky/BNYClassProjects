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

public class UserEqualsTest {


	@Test
	public final void testEqualsObject() {
		//fail("Not yet implemented"); // TODO
		
		// expected
		UserLogin expected = new UserLogin();
		expected.setId(1);
		expected.setName("Lucky");
		expected.setEmail("kawsar@gmail.com");
		expected.setPassword("12345");
	    expected.setAddress("Bronx");
		expected.setState("NY");
		expected.setZipCode("10460");
		
		//actual
		UserLogin actual = new UserLogin();
		actual.setId(1);
		actual.setEmail("kawsar@gmail.com");
		actual.setPassword("12345");
		actual.setName("Lucky");
		actual.setAddress("Bronx");
		actual.setState("NY");
		actual.setZipCode("10460");
		
		assertEquals(expected, actual);
	}

}
