package com.yash.sfm.dao;

import java.util.List;

import com.yash.sfm.model.Student;
import com.yash.sfm.model.User;

public interface UserDao {
	public User authenticateUser(User user);
}
