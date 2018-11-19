package com.wbd.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient //Eureka客户端
@EnableFeignClients//开启Feign面向接口的 LB，feign整合了ribbon,默认采用轮询的方式做LB
@EnableHystrixDashboard //开启微服务hystrix图形化界面监控
public class ConsumerRun {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerRun.class, args);
	}

}
