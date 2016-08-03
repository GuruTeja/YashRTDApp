package com.yash.rtd.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yash.rtd.model.Gender;
import com.yash.rtd.model.User;

public class UserRowMapper implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowNo) throws SQLException {
		User user = new User();
		user.setFirstname(rs.getString("firstname"));
		user.setLastname(rs.getString("lastname"));
		user.setEmail(rs.getString("email"));
		user.setPassword(rs.getString("password"));
		user.setContact(rs.getString("contact"));
		user.setDob(rs.getDate("dob"));
		user.setDoj(rs.getDate("doj"));
		user.setFk_gender_id(rs.getInt("fk_gender_id"));
		user.setFk_role_id(rs.getInt("fk_role_id"));
		user.setFk_status_id(rs.getInt("fk_status_id"));
		return user;
	}

}
