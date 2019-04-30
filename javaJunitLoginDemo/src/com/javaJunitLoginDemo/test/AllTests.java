package com.javaJunitLoginDemo.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ UserLoginDAOImpleTest.class, UserLoginTest.class })
public class AllTests {


}
