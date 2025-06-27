package com.sts.servicee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class ServiceeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceeApplication.class, args);
	}

}
