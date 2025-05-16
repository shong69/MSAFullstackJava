package com.my.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractFormController;

import com.my.model.DeptDao;
import com.my.model.DeptDto;

public class InsertController extends AbstractFormController {
	@Autowired
	DeptDao deptDao;

	@Override
	protected ModelAndView showForm(HttpServletRequest request, HttpServletResponse response, BindException errors)
			throws Exception {
		return  new ModelAndView("dept/add","errs",errors.getAllErrors()); 
	}
	
	//에러에 관한 유효성 체크
	@Override
	protected void onBindAndValidate(HttpServletRequest request, Object command, BindException errors)
			throws Exception {
		DeptDto bean = (DeptDto) command; //command에 DeptDto가 실려온다
		if(bean.getDname().isEmpty()) {
			ObjectError error = new ObjectError("dnameError","dname 생략 에러");
			errors.addError(error);
			//-> 에러를 만들어서 발생시킬 수 있음
		}
	}
	@Override
	protected ModelAndView processFormSubmission(HttpServletRequest request, HttpServletResponse response,
			Object command, BindException errors) throws Exception {
		if(errors.getErrorCount()==0) {
			deptDao.insertOne((DeptDto)command);
			return new ModelAndView("redirect:list.do");
		}
			
		return showForm(request,response,errors);
	}
	 
}
