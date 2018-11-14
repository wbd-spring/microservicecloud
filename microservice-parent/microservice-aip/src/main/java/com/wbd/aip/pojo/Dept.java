package com.wbd.aip.pojo;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * pojo,采用 lombok的方式，可以不用写 setter,gett方法
 * 和链式写法
* <p>Title: Dept.java</p>  
* <p>Description: </p>  
* @author 朱光和 
* @date 2018年11月14日
 */
@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@Accessors(chain=true)
public class Dept implements Serializable{
	
	//主键
	private Long deptno;

	//部门名称
	private String dname;
	
	//来着哪个数据库
	private String db_source;

	public Dept(String dname) {
		super();
		this.dname = dname;
	}
	
	//因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	
	
	public static void main(String[] args) {
		
//		Dept d = new Dept();
//		d.setDname("abc").setDeptno(110l);
//		
//		System.out.println(d.getDname());
		
	}
	
}
