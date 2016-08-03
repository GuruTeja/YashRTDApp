package com.yash.rtd.daospringjdbcimp;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yash.rtd.dao.UserDao;
import com.yash.rtd.model.User;
import com.yash.rtd.rowmapper.UserRowMapper;

@Repository
public class UserDaoImp implements UserDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public User authenticateUser(User user) {

		System.out.println("in authenticateUser UserDaoImp");

		String sql ="Select * from users where email=? and password=?";

		Object args[] = new Object[]{user.getEmail(),user.getPassword()};
		UserRowMapper userRowMapper = new UserRowMapper();
		User loggedUser = jdbcTemplate.queryForObject(sql, args, userRowMapper);//queryForObject return type would be return type of userRowMapper
		return loggedUser;
	}

	public User registerUser(User user) {
		System.out.println("in UserDaoImp.registerUser");
		return user;
	}

}
