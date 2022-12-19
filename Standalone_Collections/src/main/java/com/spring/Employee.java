package com.spring;

import java.util.*;

public class Employee {

	private List<String> friends;
	private HashMap<String, String> phoneNum;

	@Override
	public String toString() {
		return "Employee [friends=" + friends + ", phoneNum=" + phoneNum + "]";
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, String> getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(HashMap<String,String> phoneNum) {
		this.phoneNum = phoneNum;
	}

}
