package com.my.sts.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.my.sts.components.KafkaProducer;
import com.my.sts.model.DeptVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DeptService {
	private final KafkaProducer producer;
	public void insertOne(DeptVo bean) throws JsonProcessingException {
		producer.pub(bean);
	}
}
