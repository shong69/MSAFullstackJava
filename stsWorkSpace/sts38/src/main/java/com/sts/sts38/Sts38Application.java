package com.sts.sts38;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.sts.sts38.config.JwtFilter;
import com.sts.sts38.service.JwtService;

@SpringBootApplication
public class Sts38Application {

	public static void main(String[] args) {
		SpringApplication.run(Sts38Application.class, args);
	}

	@Bean
	JwtService jwtService(){
		return new JwtService();
	}

	@Bean
    public FilterRegistrationBean filterBean() {
		FilterRegistrationBean bean=new FilterRegistrationBean<>();
		bean.setFilter(new JwtFilter(jwtService()));
		return bean;
	}
}
