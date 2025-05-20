package com.my.sts.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class MyService2Test {
	@Autowired
	MyService2 service;
	
	@Test
	public void test() {
		service.func01();
		service.func02("msg");
		service.func03();
		service.func04();
//		assertNotNull(service);
		
		/* applicationContext.xml에서 aop 설정 때문에 실패했음
		 * myService에서 CGLIB2라이브러리가 없어서 init에 실패했다고 함 
		 * CGLIB2라이브러리 : 
		 * service 아래에 aop에 쓰이는 advice가 붙어있는 프록시가 서비스객체로 붙어있음
		 * -> 두개의 서비스 객체가 존재하고 있다 -> autoproxy 설정 해야함
		 * */
	}

}
