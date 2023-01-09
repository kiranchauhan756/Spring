package com.spring;

public class Print {
	private Student prop;

	public Student getProp() {
		return prop;
	}

	public void setProp(Student prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "Print [prop=" + prop + "]";
	}

	public Print() {
		super();
		// TODO Auto-generated constructor stub
	}
}
