package com.example.EurakeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurakeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurakeServiceApplication.class, args);
	}

}
