package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Start");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
		String query = "insert into Employee.emp(name,city) values (?,?)";
		int update = template.update(query, "Kiran Chauhan", "delhi");
		System.out.println("No. of row added=..." + update);
		/*
		 * String query2="delete from Employee.emp"; template.update(query2);
		 */

	}
}
