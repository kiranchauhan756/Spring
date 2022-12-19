package com.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Student {
	
	public Student(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	private Address address;

	@Override
	public String toString() {
		return "Student [address=" + address + ", name=" + name + ", college=" + college + "]";
	}

	@Value("#{new java.lang.String('Kiran Chauhan')}")
	private String name;

	@Value("#{new java.lang.String('Kiet')}")
	private String college;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
}
