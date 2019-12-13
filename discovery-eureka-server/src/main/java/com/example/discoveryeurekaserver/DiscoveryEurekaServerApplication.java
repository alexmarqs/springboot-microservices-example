package com.example.discoveryeurekaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryEurekaServerApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DiscoveryEurekaServerApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Starting Eureka Discovery Service...");
		SpringApplication.run(DiscoveryEurekaServerApplication.class, args);
	}

}
