package com.my.sts05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Ex06Controller {
	
	//메소드 방식 지정 속성 method -> 대괄호로 여러개 지정 가능
	@RequestMapping(value="/ex51", method= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
			RequestMethod.DELETE,RequestMethod.OPTIONS}//,
//			produces= {
//					"content-type:text/plain"
//			}
	)
	public String ex01() {
		return "ex01";
	}
}
