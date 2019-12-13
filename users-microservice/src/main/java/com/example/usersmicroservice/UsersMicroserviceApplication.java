package com.example.usersmicroservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UsersMicroserviceApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(UsersMicroserviceApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Starting Users Microservice...");
		SpringApplication.run(UsersMicroserviceApplication.class, args);
	}

}
