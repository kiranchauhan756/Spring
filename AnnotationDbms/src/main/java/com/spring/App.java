package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.account.User_Account;
import com.spring.config.Config;
import com.spring.income.dao.User_Account_Imp;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		User_Account_Imp us = (User_Account_Imp) context.getBean("us");

		User_Account user_account = new User_Account();
		user_account.setEmail_id("kiran.2124mca1090@kiet.edu");
		user_account.setFirst_name("Kiran");
		user_account.setLast_name("Chauhan");
		user_account.setPhone_num("9368045660");
		user_account.setPassword("1234");

		int insert = us.insert(user_account);
		System.out.println("add income..." + insert);
	}
}
