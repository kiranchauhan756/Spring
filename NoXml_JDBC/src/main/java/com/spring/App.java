package com.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.StudentDao.StudentDaoImp;
import com.spring.config.Config;
import com.spring.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		StudentDaoImp sDao = (StudentDaoImp) context.getBean("studentDao");
		// Student student = new Student();
		/*
		 * inserting value // insert student.setId(25); student.setName("RadheShyam");
		 * int result = sDao.insert(student); System.out.println("added..." + result);
		 * //
		 */

		// update values
		/*
		 * student.setId(25); student.setName("Ram Sita"); int update =
		 * sDao.update(student); System.out.println("Done update.."+update);
		 */

		// select operation
		List<Student> student = sDao.getAllStudent();
		for(Student x:student)
		System.out.println(x);
	}
}
