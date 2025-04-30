package com.web16.step02;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex05 extends GenericServlet {

	private void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		res.sendError(404);
//		res.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED); //Httpservlet에서 에러들을 제공하고 있음
		res.sendError(HttpServletResponse.SC_OK);
		
	}
	
	public void doPost(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String param = req.getParameter("user");
		
		res.setContentType("text/html; charset=UTF-8");
		ServletOutputStream out = res.getOutputStream();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\">");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>ex05 page</h1>");
		out.println("<p>user:"+param+"</p>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		req.setCharacterEncoding("utf-8");
		
		//req.getMethod()가 안됨(get,post 구분 불가) 
		//-> HttpServletRequest가 아니라 ServletRequest라 
		//   http통신 방식이 아니면 get post가 존재하지 않는다.
		HttpServletRequest request = (HttpServletRequest)req; //ServletRequest가 상위 패키지라 강제 형변환이 가능하다.
		HttpServletResponse response = (HttpServletResponse)res;
		
		System.out.println(request.getMethod()); 
		
		if("POST".equals(request.getMethod())) {
			doPost(request, response);
		}else if("GET".equals(request.getMethod())){
			doGet(request,response);
		}
		

	}


}
