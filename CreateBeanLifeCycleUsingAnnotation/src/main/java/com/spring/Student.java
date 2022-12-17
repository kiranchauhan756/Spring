package com.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	private String name;

	
	public Student(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	@PostConstruct
	public void init() {
		System.out.println("I am init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("I am destroy");
	}

}
