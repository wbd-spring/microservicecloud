package com.wbd.consumer.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.wbd.aip.pojo.Dept;
@Component
public class FeignClientFallback implements DeptClientService{

	@Override
	public boolean addDept(Dept dept) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Dept getDeptById(Long id) {
		
		return new Dept().setDeptno(id).setDname("我挂了");
	}

	@Override
	public List<Dept> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
