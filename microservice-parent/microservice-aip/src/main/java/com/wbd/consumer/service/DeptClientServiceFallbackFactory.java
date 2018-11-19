package com.wbd.consumer.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.wbd.aip.pojo.Dept;

import feign.hystrix.FallbackFactory;

//服务降级在客户端
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable cause) {
		return new DeptClientService() {

			@Override
			public boolean addDept(Dept dept) {
				return false;
			}

			@Override
			public Dept getDeptById(Long id) {
				return new Dept().setDeptno(id).setDname("服务降级").setDb_source("服务降级dbsource");
			}

			@Override
			public List<Dept> list() {
				return null;
			}

		};
	}

}
