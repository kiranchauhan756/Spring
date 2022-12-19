package com.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee) context.getBean("employee");

		Static_SpeL_Evaluate spel = context.getBean("static_SpeL_Evaluate", Static_SpeL_Evaluate.class);
		System.out.println(emp);
		System.out.println(spel);
		System.out.println(emp.getFriends().getClass().getName());

	}
}
