package com.wbd.provider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wbd.aip.pojo.Dept;
import com.wbd.provider.service.DeptService;

@RestController
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
	@RequestMapping(value="/dept/add",method=RequestMethod.POST)
	public boolean addDept(@RequestBody Dept dept) {
		return deptService.add(dept);
	}
	
	
	@RequestMapping("/dept/get/{id}")
	@GetMapping
	@HystrixCommand(fallbackMethod="processHystrixGetId")//@HystrixCommand断路器
	public Dept getDeptById(@PathVariable Long id) {
		Dept dept = deptService.get(id);
		if(dept==null) {
			
			throw new RuntimeException("该id"+id+"没有对应的部门信息");
		}
		return dept;
	}
	
	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public List<Dept> list() {
		
		System.out.println("ribbon LBS customer........");
		return deptService.list();
	}
	
	/**
	 * 断路器方法
	 * <p>Title: processHystrixGetId</p>  
	 * <p>Description: </p>  
	 * @param id
	 * @return
	 */
	public Dept processHystrixGetId(@PathVariable Long id) {
		Dept  dept = new Dept();
		dept.setDeptno(id).setDname("没有对应"+id+"信息").setDb_source("NO");
		return dept;
	}

}
