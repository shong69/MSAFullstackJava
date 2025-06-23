package com.java.gateway01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Gateway01Application {

	public static void main(String[] args) {
		SpringApplication.run(Gateway01Application.class, args);
	}
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder){
		return builder.routes()
				//패턴 매칭이므로 yml 파일에 정의한 순서대로 빌드해야 한다.
				//혹은 order(n)으로 순서 부여하면 빌드 순서 상관 없음
				.route(ele->{
					return ele.path("/api/user/**")
						.uri("http://localhost:8092");
				})
				.route(ele->{
					return ele.path("/api/dept/**")
						.uri("http://localhost:8091");
				})
				.route(ele->{
					return ele.path("/**")
						.uri("http://localhost:3000");
				})
				.build();
	}
}
