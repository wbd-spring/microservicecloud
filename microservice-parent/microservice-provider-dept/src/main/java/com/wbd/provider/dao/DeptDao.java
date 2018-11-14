package com.wbd.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wbd.aip.pojo.Dept;

/**
 * 部门dao接口
* <p>Title: DeptDao.java</p>  
* <p>Description: </p>  
* @author 朱光和 
* @date 2018年11月14日
 */
@Mapper
public interface DeptDao {

	public boolean addDept(Dept dept);
	
	public Dept findById(Long id);
	
	public List<Dept> findAll();
}
