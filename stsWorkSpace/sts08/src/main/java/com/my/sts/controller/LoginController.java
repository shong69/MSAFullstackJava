package com.my.sts.controller;

import java.net.HttpCookie;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login/")
@Controller
public class LoginController {
	
	@GetMapping("")
	public ResponseEntity<String> login(HttpSession session,HttpServletResponse res){
		System.out.println(session.getId()); //현재 세션 정보가 나옴
		Cookie cookie = new Cookie("hello", "world");
		cookie.setMaxAge(60*60*24); //쿠키 하루 유지
		res.addCookie(cookie);
		System.out.println(cookie.getName()); //쿠키 정보 가져옴(쿠키를 미리 만들었다는 가정 하에)
		
		return new ResponseEntity<String>("result", HttpStatus.OK);
	}
	
	@GetMapping("logout")
	public ResponseEntity<String> logout(HttpSession session){
		session.invalidate();		
		return new ResponseEntity<String>("result", HttpStatus.OK);
	}
}
