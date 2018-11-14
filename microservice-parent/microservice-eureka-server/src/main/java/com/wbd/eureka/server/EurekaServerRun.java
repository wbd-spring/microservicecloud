package com.wbd.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer   //enableeureka开启服务器
public class EurekaServerRun {

	public static void main(String[] args) {
		
		SpringApplication.run(EurekaServerRun.class, args);

	}

}
