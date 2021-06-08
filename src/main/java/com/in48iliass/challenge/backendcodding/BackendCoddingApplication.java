package com.in48iliass.challenge.backendcodding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.in48iliass.challenge.backendcodding")
@EnableCircuitBreaker
public class BackendCoddingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendCoddingApplication.class, args);
	}

}
