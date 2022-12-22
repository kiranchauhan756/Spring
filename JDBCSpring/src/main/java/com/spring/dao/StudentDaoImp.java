package com.spring.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.entity.Student;

public class StudentDaoImp implements StudentDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query = "insert into Student.stu(id,name,city) values (?,?,?)";
		int update = jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return update;
	}

}
