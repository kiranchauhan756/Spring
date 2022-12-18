package com.spring;

public class Employee {
	private Address address;
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
