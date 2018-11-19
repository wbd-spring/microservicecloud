package com.wbd.consumer.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wbd.aip.pojo.Dept;

/**
 * fallback 是服务熔断， 断路器， 在服务提供方，必须对应一个方法，
 * fallbackFactory 是服务降级， 是在客户端，必须对应一个类， 该类必须实现FallbackFactory接口
* <p>Title: DeptClientService.java</p>  
* <p>Description: </p>  
* @author 朱光和 
* @date 2018年11月16日
 */
@FeignClient(value="microservice-provider-dept",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

	
	@RequestMapping(value="/dept/add",method=RequestMethod.POST)
	public boolean addDept(@RequestBody Dept dept);
	
	
	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	public Dept getDeptById(@PathVariable("id") Long id);
	
	
	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public List<Dept> list();
	
}
