package com.wbd.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wbd.aip.pojo.Dept;

@RestController
public class DeptConsumer {
	
	private static final String REST_URL_PRE="http://localhost:8001";
	//注入RestTemplate对象， 已经再ConfBean类中注入了bean
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/consumer/dept/add",method=RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		return restTemplate.postForObject(REST_URL_PRE+"/dept/add", dept, Boolean.class);
	}
	
	
	@RequestMapping("/consumer/dept/get/{id}")
	public Dept getDeptById(@PathVariable Long id) {
		return restTemplate.getForObject(REST_URL_PRE+"/dept/get"+id, Dept.class);
	}
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/consumer/dept/list")
	public List<Dept> getAll() {
		return restTemplate.getForObject(REST_URL_PRE+"/dept/list", List.class);
	}

}
