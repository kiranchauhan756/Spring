package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Addition addition = (Addition) context.getBean("addition1");
		addition.doSum();
		Addition addition1 = (Addition) context.getBean("addition2");
		addition1.doSum();
	}
}
