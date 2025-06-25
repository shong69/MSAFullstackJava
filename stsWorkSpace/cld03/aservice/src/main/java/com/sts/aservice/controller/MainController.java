package com.sts.aservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.retry.annotation.Retry;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MainController {
	private final RestTemplate template;

//	@CircuitBreaker(name="dept",fallbackMethod = "fallback")//실행 실패 시 fallback 메소드 수행
	@Retry(name="dept", fallbackMethod="fallback")
	@GetMapping("/")
	public String index() {
		return template.getForObject("http://localhost:8082/api/list", String.class);
	}
	
	private String fallback(Exception e){
		return e.getMessage();
	}
}
