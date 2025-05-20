package com.my.sts.di;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.my.sts.service.MyService;

@RunWith(SpringJUnit4ClassRunner.class) //springframework.test 패키지 -> contextConfiguration으로 컴포넌트설정 위치 지정 후 동화시키는 주체
@ContextConfiguration(locations="classpath:/applicationContext.xml") //2. 복수 개로 지정 가능
//main 메소드 대신 프로젝트 작동 확인하는 용도
public class MyServiceTest {
//	static ApplicationContext ac;
	@Autowired
	MyService my;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {		
//		ac = new ClassPathXmlApplicationContext("/applicationContext.xml"); 1. 기본 방법
		
//		ac = AnnotationConfigApplicationContext("classpath:/applicationContext.xml") -> 3. 어노테이션 컨피그 설정 위치 잡아주는 메서드 
		//autowired 대신 사용이 가능함. 대신 @ContextConfiguration()을 쓰지 못하기 때문에 static ApplicationContext ac 초기화가 필요함
		
	}

	@Before
	public void setUp() throws Exception {
//		my=ac.getBean(MyService.class);
	}

	@Test
	public void testService() {
		my.service();
	}

}
