package com.my.sts.components;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.my.sts.model.DeptVo;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class KafkaConsumer {
	private final KafkaTemplate<String, Object> template;
	private final ObjectMapper mapper;
	
	@KafkaListener(topics="pic02",groupId="myGroup")
	public void event(String msg) throws JsonMappingException, JsonProcessingException {
		DeptVo bean=mapper.readValue(msg, DeptVo.class);
		try {
			//insert into
			throw new RuntimeException();
		}catch (Exception e) {
			//롤백하는 이벤트를 발생시킨다.
			template.send("ex", mapper.writeValueAsString(bean));
		}
		
		System.out.println(bean);
	}
	@KafkaListener(topics="pic02",groupId="myGroup")
	public void back(String msg) throws JsonMappingException, JsonProcessingException {
		DeptVo bean=mapper.readValue(msg, DeptVo.class);
		try {
			//delete from
			//예외가 발생하는 순간 
			throw new RuntimeException();
		}catch (Exception e) {
			//롤백하는 이벤트를 발생시킨다.
			template.send("ex", mapper.writeValueAsString(bean));
		}
		
		System.out.println(bean);
	}
}
