package com.wbd.consumer.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Configuration注解类似spring的applicaiton.xml文件，
 * 里面配置多个bean
* <p>Title: ConfBean.java</p>  
* <p>Description: </p>  
* @author 朱光和 
* @date 2018年11月14日
 */
@Configuration
public class ConfBean {
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
		
	}
}
