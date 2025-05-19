package com.my;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * @author user
 *	servlet-context.xml에서 
 *<context:component-scan base-package="com.my.sts05" />
 *으로 되어 있기 때문에 해당 컨트롤러를 인식하지 않는다.
 */
@Controller		
public class Ex03Controller {
	@RequestMapping("/ex21.do")
	public String ex1() {
		return "ex01";
	}
}
