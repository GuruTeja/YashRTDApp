package com.yash.rtd.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.rtd.dao.UserDao;
import com.yash.rtd.model.User;
import com.yash.rtd.service.UserService;

@Service
public class UserServiceImp implements UserService{
	
	@Autowired
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public User authenticateUser(User user) {
		return userDao.authenticateUser(user);
	}

	public User registerUser(User user) {
		return userDao.registerUser(user);
	}

}
