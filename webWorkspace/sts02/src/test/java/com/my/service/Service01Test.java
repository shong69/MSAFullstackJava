package com.my.service;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service01Test {
	static ApplicationContext ac;
	Service01 service;
	@BeforeClass
	public static void setUpBeforeClass(){
		ac = new ClassPathXmlApplicationContext("/applicationContext.xml");
		
	}
	@Before
	public void setUp() {
		service = (Service01) ac.getBean("service");
		
	}
	@Test
	public void testService01() {
		service.serv01();
	}


}
