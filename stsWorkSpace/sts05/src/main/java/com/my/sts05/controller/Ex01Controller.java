package com.my.sts05.controller;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
public class Ex01Controller {
	
	@RequestMapping(value="/ex01.do")
	public ModelAndView ex01() {
		return new ModelAndView("ex01");
	}
	
	@RequestMapping(value="/ex02.do")
	public String ex02() {
		return "ex01";
	}
	
	@RequestMapping(value="/ex03.do")
	public View ex03() {
		return new View() {
			
			/** view로 보내주는 메서드
			 *Render the view given the specified model. 
			 *The first step will be preparing the request: 
			 *In the JSP case,this would mean setting model objects as request attributes.
			 *The second step will be the actual rendering of the view,for example including the JSP via a RequestDispatcher.
			 */
			@Override
			public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
					throws Exception {
				//1. 요청으로 반환하기
//				request.getRequestDispatcher("/WEB-INF/views/ex01.jsp").forward(request, response);
				//직접 구현해서 응답으로 보내는 방법
				response.setContentType(getContentType());
				PrintWriter out = response.getWriter();
				out.println("<h1>hello</h1>");
				out.close();
				
			}
			
			@Override
			public String getContentType() {
				// Return the content type of the view
				return "text/plain";
			}
		};
	}
	
	
	//void인 경우 시스템이 알아서 요청받은 url 패턴을 바탕으로 파일 시스템에서 jsp파일 이름을 찾게 된다. 
	//-> /WEB-INF/views/ex04.jsp  파일을 찾을 수 없다는 에러 메시지 반환됨
	@RequestMapping(value="/ex04.do")
	public void ex04() {
		System.out.println("run ex04.do");
	}
	
	//ex04의 경우와 마찬가지로 return null을 하는 경우에도 요청받은 패턴을 바탕으로 파일을 찾는다.
	// 리턴 타입이 String, void 에서는 jsp를 찾게 되지만
	//ModelAndView인 경우에는 view를 반환하지 않게 된다.
	@RequestMapping(value="/ex05.do")
	public String ex05() {
		return null;
	}
}
