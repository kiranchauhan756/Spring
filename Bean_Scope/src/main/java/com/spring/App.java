package com.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee) context.getBean("employee");
		Employee emp1 = (Employee) context.getBean("employee");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.nextLine();
		emp.setName(name);

		System.out.println(emp.hashCode());
		System.out.println(emp1.hashCode());
		System.out.println(emp);

	}
}
