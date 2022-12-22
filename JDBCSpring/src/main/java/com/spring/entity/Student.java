package com.spring.entity;

public class Student {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private String city;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" +city + "]";
	}
}
