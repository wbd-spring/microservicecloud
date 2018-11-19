package com.wbd.zuul.gateway.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication

@EnableZuulProxy
public class ZuulGatewayRun {

	public static void main(String[] args) {
	
      SpringApplication.run(ZuulGatewayRun.class, args);
	}

}
