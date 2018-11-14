package com.wbd.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //表示eureka客户端
public class ProviderRun {

	public static void main(String[] args) {
	
      SpringApplication.run(ProviderRun.class, args);
	}

}
