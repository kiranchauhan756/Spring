package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.dao.StudentDao;
import com.spring.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Start");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = (StudentDao) context.getBean("studentDao");
		Student s = new Student();
		s.setId(22);
		s.setName("Pooja Chauhan");
		s.setCity("delhi");
		int result=studentDao.insert(s);
		System.out.println("Added "+result);
	}
}
