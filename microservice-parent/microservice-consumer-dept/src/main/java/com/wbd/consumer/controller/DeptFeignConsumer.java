package com.wbd.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wbd.aip.pojo.Dept;
import com.wbd.consumer.service.DeptClientService;

@RestController
public class DeptFeignConsumer {
	
	 @Autowired
     private DeptClientService  deptClientService;
	
	@RequestMapping(value="/feign/consumer/dept/add",method=RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		return deptClientService.addDept(dept);
	}
	
	
	@RequestMapping("/feign/consumer/dept/get/{id}")
	public Dept getDeptById(@PathVariable Long id) {
		return deptClientService.getDeptById(id);
	}
	
	
	@RequestMapping("/feign/consumer/dept/list")
	public List<Dept> getAll() {
		return deptClientService.list();
	}

}
