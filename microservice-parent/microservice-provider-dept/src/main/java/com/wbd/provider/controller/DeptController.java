package com.wbd.provider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	public Dept getDeptById(@PathVariable Long id) {
		return deptService.get(id);
	}
	
	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public List<Dept> list() {
		
		System.out.println("ribbon LBS customer........");
		return deptService.list();
	}

}
