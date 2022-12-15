package com.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements DisposableBean,InitializingBean {
	private String name;

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public Student(String name) {
		super();
		System.out.println("setting student name");
		this.name = name;
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside init method");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside destroy method");
		
	}
   
}
