package com.web16.step01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Ex03 extends GenericServlet{
	//servlet의 중복되는 코드는 추상 클래스로 만들어서 상속 받도록 했다.
	//-> service 코드만 직접 쓸 수 있도록 
	//근데 내가 직접 안만들어도 이미 이런 패키지가 있음 - javax.servlet.GenericServlet;
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
	}

}
