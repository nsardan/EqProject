package com.eq.service;

import com.eq.dao.UserDAO;
import com.eq.model.User;

public class UserService {
	
	private UserDAO userDAO;
	

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}


	public void saveUser(User user){
		userDAO.save(user);
	}
	
	public User findUserById(int userId){
		User user = userDAO.findUserByUserId(userId);
		return user;
	}

}
