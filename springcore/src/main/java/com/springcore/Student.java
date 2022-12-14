package com.springcore;

public class Student {
     private int Id;
     private String Name;
     private String Address;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Student(int id, String name, String address) {
		super();
		Id = id;
		Name = name;
		Address = address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", Address=" + Address + "]";
	}
     
}
