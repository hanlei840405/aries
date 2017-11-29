package com.galaxy.framework.aries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AriesApplication.class, args);
	}
}
