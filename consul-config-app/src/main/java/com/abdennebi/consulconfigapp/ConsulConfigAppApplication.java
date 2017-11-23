package com.abdennebi.consulconfigapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConsulConfigAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulConfigAppApplication.class, args);
	}
}
