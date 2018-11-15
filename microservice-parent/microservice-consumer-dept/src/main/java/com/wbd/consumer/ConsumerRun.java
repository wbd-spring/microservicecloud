package com.wbd.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerRun {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerRun.class, args);
	}

}
