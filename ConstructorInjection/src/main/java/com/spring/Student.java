package com.spring;

import java.util.List;

public class Student {
	private String name;
	private int id;
	private List<String> college;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int id, List<String> college, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.college = college;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", college=" + college + ", address=" + address + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getCollege() {
		return college;
	}

	public void setCollege(List<String> college) {
		this.college = college;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
