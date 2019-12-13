package com.example.apigatewayzuul;

import com.example.apigatewayzuul.filters.PreZuulFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ApiGatewayZuulApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ApiGatewayZuulApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Starting API Gateway Zuul Service...");
		SpringApplication.run(ApiGatewayZuulApplication.class, args);
	}

	@Bean
	public PreZuulFilter preZuulFilter() {
		return new PreZuulFilter();
	}

}
