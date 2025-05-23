package com.my.sts.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	@Value("${spring.profiles.default}")
	String msg;
	@GetMapping("/")
	public String index() {return "index";}
	
	@GetMapping("/intro")
	public void intro(Model model) {
		
		model.addAttribute("msg", msg);
	}
	
	@GetMapping("/login/")
	public String login(HttpSession session) {
		HttpSession loginSession = session;
		return "login/login";
	}
	@GetMapping("/upload/")
	public String upload() {
		return "file";
	}
	@PostMapping("/upload")
	public ResponseEntity<?>upload(String name, MultipartFile file){
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
