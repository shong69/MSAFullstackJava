package com.my.sts.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MainController {

	@GetMapping("/")
	public ResponseEntity<?> index() {
		String url="https://dummyjson.com/carts";
//		String url="https://jsonplaceholder.typicode.com/posts";
		RestTemplate template;
		template=new RestTemplate();
		
//		ResponseEntity<Map> result = template.getForEntity(url, Map.class);
//		return result;
//		Map result = template.getForObject(url, Map.class);
//		return ResponseEntity.ok(result);
		
//		return template.postForEntity(url, null, String.class);
		Map req=Map.of("limit","1");
		  
		HttpHeaders headers = new HttpHeaders();
//		headers.set("헤더이름", "값");
		MultiValueMap<String, String> body = new LinkedMultiValueMap<String, String>();
		body.add("limit", "1");
		 
		// 설정한 Header와 Body를 가진 HttpEntity 객체 생성
		HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(body, headers);
		return template.exchange(url, HttpMethod.POST, entity, String.class);
	}
	
}










