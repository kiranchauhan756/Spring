package com.spring.BeanOfRefrence;

import java.util.List;

public class Employee {
	private String name;
	private List<Integer> salary;
	private Address address;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

	public Employee(String name, List<Integer> salary, Address address) {
		super();
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getSalary() {
		return salary;
	}

	public void setSalary(List<Integer> salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
