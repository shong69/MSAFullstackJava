package com.my.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) //이름으로 정렬해 테스트해주는 어노테이션
public class DeptDaoTest {
	DeptDao dao;

	@Before
	public void setUp() {
		dao = new DeptDao();
	}
	@After
	public void tearDown() {
	}
	
	//원하는 순서대로 테스트 진행하기 위해 tes1,2,3...으로 이름 붙인다.
	@Test
	public void test1SelectAll() throws SQLException {
		//Given
		DeptDao dao = new DeptDao();
		
		//When, Then
		assertNotNull(dao.selectAll());
		assertNotSame(0, dao.selectAll().size());
//		assertTrue(dao.selectAll().size()>0);
	}

	@Test
	public void test3SelectOne() throws SQLException {
		//Given
		DeptDao dao = new DeptDao();
		//When
//		DeptDto bean = dao.selectOne(1111);
		//Then
		DeptDto target = new DeptDto(1111,"본사","서울");
		DeptDto bean = dao.selectOne(target.getDeptno());
		assertNotNull(bean);
		assertEquals(target,bean);
//		assertSame(1111,bean.getDeptno());
//		assertEquals("본사",bean.getDname());
//		assertEquals("서울",bean.getLoc());
	}
	
	@Test
	public void test2InsertOne() throws SQLException {
		//Given
		DeptDto target = new DeptDto(8888,"테스트","강남");
		
		//When,Then
		assertNotSame(0,dao.insertOne(target));
	}
	
	@Test
	public void test5DeleteOne() throws SQLException {
		DeptDto target = new DeptDto(8888,"테스트","강남");
		assertNotSame(0,dao.deletOne(target.getDeptno()));
	}
	
	@Test 
	public void test4UpdateOne2() throws SQLException{
		DeptDto target = new DeptDto(7777,"테스트","테스트");
		assertNotSame(0, dao.updateOne(target));
	}
}
