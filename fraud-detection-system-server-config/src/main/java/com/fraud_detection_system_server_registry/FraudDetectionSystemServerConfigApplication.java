package com.fraud_detection_system_server_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FraudDetectionSystemServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(FraudDetectionSystemServerConfigApplication.class, args);
	}

}
