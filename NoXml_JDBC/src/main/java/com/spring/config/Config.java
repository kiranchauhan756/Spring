package com.spring.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.StudentDao.StudentDaoImp;

@Configuration
@ComponentScan
public class Config {

	@Bean(name={"ds"})
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
	
		ds.setUrl("jdbc:mysql://localhost:3306/Student1");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");

		ds.setUsername("root");
		ds.setPassword("");
		return ds;
	}

	@Bean(name={"jdbcTemplate"})
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}

	@Bean(name={"studentDao"})
	public StudentDaoImp getStudentDao() {
		StudentDaoImp studentDao = new StudentDaoImp();
		studentDao.setJdbcTemplate(getJdbcTemplate());
		return studentDao;
	}

}
