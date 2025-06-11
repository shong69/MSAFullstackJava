package com.my.sts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.my.sts.model.DeptRepo;

@SpringBootApplication
public class Sts25Application {

	public static void main(String[] args) {
		SpringApplication.run(Sts25Application.class, args);
	}

	@Autowired
	DeptRepo deptRepo;
	
	
}
