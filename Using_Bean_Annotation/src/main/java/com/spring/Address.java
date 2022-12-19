package com.spring;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	@Value("#{new java.lang.String('Tundla')}")
	private String city;

	@Value("Uttar Pradesh")
	private String state;

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
