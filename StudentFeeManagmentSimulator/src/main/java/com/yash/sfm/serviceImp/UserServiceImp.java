package com.yash.sfm.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yash.sfm.dao.UserDao;
import com.yash.sfm.model.Student;
import com.yash.sfm.model.User;
import com.yash.sfm.service.UserService;
@Service
public class UserServiceImp implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Transactional
	public User authenticateUser(User user) {
		return userDao.authenticateUser(user);
	}	
}
