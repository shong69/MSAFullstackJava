package com.my.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.cj.jdbc.MysqlDataSource;

//메소드 이름 오름차순 테스트 실행
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DeptDaoImplTest {
	static ApplicationContext ac;
	DeptDao dao;
	DeptDto target;
	@BeforeClass
	public static void setUpBeforeClass(){
		ac = new ClassPathXmlApplicationContext("/applicationContext.xml");
		
	}
	@Before
	public void setUp() {	
		//getBean : type matching
		dao = ac.getBean(DeptDaoImpl.class);
		target=new DeptDto(1111,"test", "test");
	}
	
	@Test
	public void test1SellectAll() {
		assertNotNull(dao.selectAll());
	}

	@Test
	public void test2insertOne() {
		dao.insertOne(target);
	}
	@Test
	public void test3selectOne() {
		assertEquals(target, dao.selectOne(target.getDeptno()));
	}
	@Test
	public void test4UpdateOne() {
		target.setDname("test2");
		assertSame(target, dao.update(target));
	}
	@Test
	public void test5DelteOne() {
		assertSame(target,dao.deleteOne(target.getDeptno()));
	}

}
