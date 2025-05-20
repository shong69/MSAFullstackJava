package com.my.sts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.sts.di.MyModule;

@Service
public class MyService {
	@Autowired
	MyModule module;
//	public void setModule(MyModule module) {
//		//setter 생성을 통한 의존성 주입으로 초기화
//		this.module = module;
//	}
	public void service() {
		module.func01();
	}
}
