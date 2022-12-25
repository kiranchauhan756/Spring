package com.spring.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.income.dao.User_Account_Imp;



@Configuration
@ComponentScan("com.spring.income.dao")
public class Config {
	@Bean(name={"ds"})
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/bachat");
		ds.setUsername("root");
		ds.setPassword("");
		return ds;
	}

	@Bean(name={"temp"})
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate temp = new JdbcTemplate();
		temp.setDataSource(getDataSource());
		return temp;
	}

	@Bean(name={"us"})
	public User_Account_Imp getUser_Account() {
		User_Account_Imp user_account = new User_Account_Imp();
		user_account.setJdbcTemplate(getJdbcTemplate());
		return user_account;
	}

}
