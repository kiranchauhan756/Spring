package com.spring.income.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.account.User_Account;

public class User_Account_Imp implements User_Account_Dao {
    @Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(User_Account user_account) {
		String query = "insert into bachat.user_account values(?,?,?,?,?)";
		int update = this.jdbcTemplate.update(query, user_account.getEmail_id(), user_account.getFirst_name(),
				user_account.getLast_name(), user_account.getPhone_num(), user_account.getPassword());
		return update;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
