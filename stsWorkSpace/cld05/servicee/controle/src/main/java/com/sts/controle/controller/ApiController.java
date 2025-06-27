package com.sts.controle.controller;

import java.net.http.HttpHeaders;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequiredArgsConstructor
public class ApiController {
    final RestTemplate restTemplate;
    final KafkaTemplate kafkaTemplate;
    final ObjectMapper mapper;

    @GetMapping("/api/v1/emp/")
    public ResponseEntity<?> list(){
        return restTemplate.getForEntity("http://localhost:7011/", List.class);
    }

    @PostMapping("/api/v1/emp/")
    public ResponseEntity<?> postMethodName(@RequestBody LinkedHashMap<String, Object> map) throws JsonProcessingException {      
       String msg = mapper.writeValueAsString(map);
       kafkaTemplate.send("emppic",map);
        return ResponseEntity.ok().build();
        
    }
    
}
