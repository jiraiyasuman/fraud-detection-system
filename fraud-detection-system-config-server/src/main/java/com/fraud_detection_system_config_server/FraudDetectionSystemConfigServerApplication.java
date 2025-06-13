package com.fraud_detection_system_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class FraudDetectionSystemConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FraudDetectionSystemConfigServerApplication.class, args);
	}

}
