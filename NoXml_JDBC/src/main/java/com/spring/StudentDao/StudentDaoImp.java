package com.spring.StudentDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.entity.Student;

public class StudentDaoImp implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		String query = "insert into Student1.stu(id,name) values(?,?)";
		int update = this.jdbcTemplate.update(query, student.getId(), student.getName());
		return update;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int update(Student student) {
		String query="update Student1.stu set name=? where id=?";
		int update = this.jdbcTemplate.update(query,student.getName(),student.getId());
		return update;
	}

	public List<Student> getAllStudent() {
		String query="Select * from Student1.stu";
		List<Student> student=this.jdbcTemplate.query(query, new RowMapperImp());
		return student;
	}

}
