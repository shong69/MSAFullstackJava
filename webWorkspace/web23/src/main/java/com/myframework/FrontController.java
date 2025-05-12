package com.myframework;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController  extends HttpServlet{
	Logger logger = Logger.getLogger(this.getClass().getCanonicalName());
	
	//3. init을 사용하는 방법
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		Enumeration<String> enu = config.getInitParameterNames();
		
		while(enu.hasMoreElements()) {			
			String url = enu.nextElement();
			String val = config.getInitParameter(url);
			try {
				Class clz=Class.forName(val);
				handlerMapping.put(url, (Controller)clz.newInstance());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	//2. Constructor에서 map에 담은 요청 기반으로 url 가져오는 방법 -> 싱글톤 패턴 사용하기
	java.util.Map<String, Controller> handlerMapping = new java.util.HashMap<>();
	public FrontController() {
		java.util.Map<String, String> map = new java.util.HashMap<>();
		map.put("/index","com.my.controller.IndexController");
		map.put("/main","com.my.controller.MainController");
		map.put("/bbs/list","com.my.controller.ListController");
		map.put("/bbs/insert","com.my.controller.InsertController");
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>>ite=set.iterator();
		while(ite.hasNext()) {
			Entry<String, String> entry = ite.next();			
			try {
				Class clz=Class.forName(entry.getValue());
				handlerMapping.put(entry.getKey(),(Controller) clz.newInstance());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		doDo(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doDo(req, resp);
	}
	
	protected void doDo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//doGet과 doPost를 받아와서 분기처리
//		logger.info(req.getRequestURL().toString()); //정보: http://localhost:8080/web23/main  출력됨
//		logger.info(req.getRequestURI()); //정보: /web23/main 출력됨
//		logger.info(req.getContextPath()); //정보: /web23 출력됨
		
		//요청 url /index,/bbs/list등 추출하기
		String url = req.getRequestURI();
//		url=url.replace(req.getContextPath(), "");
		url = url.substring(req.getContextPath().length());
		
		//1. 직접 컨트롤러의 요청 패키지 주소를 찾는 방법
//		String info = null;
//		String info = map.get(url);
//		if("/index".equals(url)) {			
//			info ="com.my.controller.IndexController";
//
//		}else if("/main".equals(url)) {
//			info = "com.my.controller.MainController";
//	
//		}else if("/bbs/list".equals(url)) {
//			info = "com.my.controller.ListController";
//
//		}else if("/bbs/insert".equals(url)){
//			info = "com.my.controller.InsertController";
//		}

		
		//2. Constructor에서 map에 담은 요청 기반으로 url 가져오는 방법 -> 싱글톤 패턴 사용하기
		Controller controller =handlerMapping.get(url);
		if(controller == null) {
			resp.sendError(HttpServletResponse.SC_NOT_FOUND);
			return;
		}
		
		String result=controller.execute(req, resp);
		if(result.startsWith("redirect:")) {
//			result=result.replace("redirect:", "");
			resp.sendRedirect(result.substring("redirect:".length()));
		}else {
			String prefix="/WEB-INF/views/";
			String suffix=".jsp";
			String viewName=prefix+result+suffix;
			req.getRequestDispatcher(viewName).forward(req, resp);
		}

		
	}
}
