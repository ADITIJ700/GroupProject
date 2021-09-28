package com.p1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class BankingClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingClientApplication.class, args);
	}

}
