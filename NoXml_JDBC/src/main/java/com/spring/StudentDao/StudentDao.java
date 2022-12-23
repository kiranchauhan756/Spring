package com.spring.StudentDao;

import java.util.List;

import com.spring.entity.Student;

public interface StudentDao {
	public int insert(Student student);

	public int update(Student student);

	public List<Student> getAllStudent();
}
