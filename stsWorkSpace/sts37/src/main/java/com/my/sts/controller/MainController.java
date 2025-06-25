package com.my.sts.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.my.sts.model.DeptVo;
import com.my.sts.service.DeptService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MainController {
	final DeptService service;
	@PostMapping("/")
	public DeptVo add(@RequestBody DeptVo bean) throws JsonProcessingException {
		
		for(int i=0;i<20;i++) {
			service.insertOne(bean);
			bean.setDeptno(bean.getDeptno()+i);
		}
		return bean;
	}
}
