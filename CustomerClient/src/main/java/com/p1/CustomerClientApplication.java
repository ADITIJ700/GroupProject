package com.p1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class CustomerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerClientApplication.class, args);
	}

}
