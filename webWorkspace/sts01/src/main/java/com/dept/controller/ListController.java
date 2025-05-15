package com.dept.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.dept.model.DeptDao;

public class ListController implements Controller{
	DeptDao deptDao;
	//dao의 setter 만들어서 객체를 한번만 생성해서 사용하도록 함
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		request.setAttribute("list", dao.selectAll());
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",deptDao.selectAll()); //model에 보내는 방식 사용
		mav.setViewName("dept/list"); //WEB-INF아래 jsp 파일로(..servlet.xml에서 형식 지정해줌)
		return mav;
	}
}
