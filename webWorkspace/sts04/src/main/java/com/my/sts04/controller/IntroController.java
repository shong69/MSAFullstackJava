package com.my.sts04.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.my.sts04.model.DeptDao;
//import org.springframework.web.servlet.mvc.Controller;

@org.springframework.stereotype.Controller
public class IntroController {//implements Controller{
	//slf4j 인터페이스 사용
	Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	DeptDao deptDao;
	
	@RequestMapping("/intro")
	//@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("intro");
	}
	
	//메소드명을 자유롭게 지정 가능하다. 
	//-> Controller인터페이스에서 상속하지 않은 메소드여도 @RequestMapping()을 사용하면 뷰와 매핑이 가능해졌다
	//=> Controller 인터페이스의 상속이 불필요해짐 
	//	ㄴ>POJO 지향 + 가벼운 애플리케이션(하나의 객체에서 상속 없이 다양한 메서드 사용하며 재사용이 가능함) 
	//		+ 제약이 없고 단순함 + xml의 중요성이 낮아짐(==에러 발생 위험도 낮아짐) 
	@RequestMapping("/ex02")
	public ModelAndView ex02(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		return new ModelAndView("ex02");
	}
	
	//String으로 url을 리턴 가능함 (규약이 존재하지 않기 때문에)
	@RequestMapping("/ex03")
	public String ex03(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		return "ex03";
	}
	
	//request, response 매개변수가 없어도 작동함 - 필요한 매개변수를 그때그때 사용하면 됨
	//java replication 
	@RequestMapping("/ex04")
	public String ex04(String id, int su) { //파라미터를 직접 받아올 수 있음 -> int su : parseInt를 저절로 하고 있음
		log.debug(id);
		log.debug(su+"");
		deptDao.func01();
		return "ex04";
	}
}
