package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("address1")
	private Address address;

	@Autowired
	@Qualifier("salary1")

	private Salary salary;

	public Employee(Address address, Salary salary) {
		super();
		this.address = address;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + ", salary=" + salary + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}
}
