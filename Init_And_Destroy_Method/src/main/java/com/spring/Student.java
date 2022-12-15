package com.spring;

public class Student {
	private String name;

	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("I m going to die");
	}

	public Student(String name) {
		System.out.println("init call after setting the value means instantiating the object value");
		
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
}
