package com.spring;

public class Student {
	private String name;

	public Student(String name, String college, int fees) {
		super();
		this.name = name;
		this.college = college;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", college=" + college + ", fees=" + fees + "]";
	}

	public String getName() {
		return name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	private String college;
	private int fees;
}
