package com.sts.servicee.components;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sts.servicee.domain.EmpRepo;
import com.sts.servicee.domain.EmpVo;
import com.sts.servicee.service.LocalService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class KafkaConsumer {
    final LocalService service;
    final ObjectMapper mapper;

    //서비스 간에 데이터 통신을 위한 카프카 설정
    @KafkaListener(topics = "emppic",groupId = "myGroup")
    public void event(ConsumerRecord record) throws JsonMappingException, JsonProcessingException{
        // Object key = record.key();
        Object value = record.value();
        System.out.println(value);
        // EmpVo bean=mapper.readValue(msg, EmpVo.class);
        // service.add(bean);
    }
}
