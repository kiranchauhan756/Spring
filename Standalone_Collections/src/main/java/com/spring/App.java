package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee) context.getBean("employee");
		System.out.println(emp);
		System.out.println(emp.getFriends().getClass().getName());
		System.out.println(emp.getPhoneNum().getClass().getName());
	}
}
