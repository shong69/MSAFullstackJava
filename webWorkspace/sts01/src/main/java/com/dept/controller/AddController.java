package com.dept.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.dept.model.DeptDao;
import com.dept.model.DeptDto;

public class AddController implements Controller{
	private DeptDao deptDao; //private 선언을 해도 이미 setter 메서드를 통해 필드 값으로 주입이 됨(sts01-servlet.xml에서 bean의 property로 주입됐음)
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		if("GET".equals(request.getMethod())) {
			mav.setViewName("dept/add");		
			
		}else if("POST".equals(request.getMethod())){
			request.setCharacterEncoding("utf-8");
			deptDao.insertONe(new DeptDto(
					Integer.parseInt(request.getParameter("deptno")),
					request.getParameter("dname"),
					request.getParameter("loc")
					));
			
			mav.setViewName("redirect:list.do");
		}
		
		return mav;
	}
}
