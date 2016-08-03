package com.yash.rtd.service;

import com.yash.rtd.model.User;

public interface UserService {
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
