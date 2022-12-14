package com.spring;

import java.util.HashMap;

public class Employee {
	private String name;
	private HashMap<String, Integer> position;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashMap<String, Integer> getPosition() {
		return position;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, HashMap<String, Integer> position, Address address) {
		super();
		this.name = name;
		this.position = position;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + ", address=" + address + "]";
	}

	public void setPosition(HashMap<String, Integer> position) {
		this.position = position;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
