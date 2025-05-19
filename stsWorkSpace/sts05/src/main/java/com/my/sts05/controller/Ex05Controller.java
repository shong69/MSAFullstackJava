package com.my.sts05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.sts05.dept.model.DeptVo;

@Controller
public class Ex05Controller {

	@RequestMapping("/ex41.do")
	public void ex41() {
	}
	
	@RequestMapping("/ex42.do")
	public void ex42(int deptno, String dname, String loc, @ModelAttribute("bean") DeptVo dto) {
		dto.setDeptno(deptno); dto.setDname(dname); dto.setLoc(loc);
		//@ModelAttribute("bean")은 Spring MVC가 HTTP 요청 파라미터를 DeptVo 객체로 자동으로 바인딩하여 전달해 주는 역할을 합니다.
		//따라서 DeptVo 객체는 폼에서 전송된 데이터(예: deptno, dname, loc)와 매핑되어 dto 객체로 전달
		
		//@ModelAttribute("bean")을 사용하면, DeptVo 객체가 bean이라는 이름으로 모델에 저장됩니다.
		//ex42 메서드는 **deptno, dname, loc**을 매개변수로 받고 있습니다. 이 값들은 폼에서 전달된 값으로, @ModelAttribute로 DeptVo 객체를 받을 수 있습니다.

		//@ModelAttribute를 사용할 때, Spring은 폼에서 전달된 데이터를 자동으로 DeptVo 객체의 필드에 바인딩합니다.
		//따라서 deptno, dname, loc 파라미터 값은 DeptVo 객체의 필드에 자동으로 세팅됩니다.
	}
}
