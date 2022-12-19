package com.spring;

import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Override
	public String toString() {
		return "Employee [name=" + name + ", friends=" + friends + "]";
	}

	@Value("#{ new java.lang.String('Kittu Chauhan')}")
	private String name;

	@Value("#{friends}")
	private Set<String> friends;

	public Set<String> getFriends() {
		return friends;
	}

	public void setFriends(Set<String> friends) {
		this.friends = friends;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
