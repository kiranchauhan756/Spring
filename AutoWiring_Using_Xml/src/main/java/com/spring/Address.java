package com.spring;

public class Address {
	private String city;
	private String state;

	@Override
	public String toString() {
		return "[city=" + city + ", state=" + state + "]";
	}

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
}
