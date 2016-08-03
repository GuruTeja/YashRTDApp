package com.yash.rtd.dao;

import com.yash.rtd.model.User;

public interface UserDao {
	/**
	 * This method will Authenticating the User from Database
	 * @param user
	 * @return
	 */
	public User authenticateUser(User user);
	
	/**
	 * THis method will Register the User to Database
	 * @param user
	 * @return
	 */
	public User registerUser(User user);
	
	
}
