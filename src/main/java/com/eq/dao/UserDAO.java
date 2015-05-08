package com.eq.dao;

import java.util.List;

import com.eq.model.User;

public interface UserDAO {
	
	/**
	 * @return
	 * Save the the user object 
	 **/
	public void save(User user);

	/**
	 * 
	 * @return
	 */
	public List<User> list();
	
	/**
	 * 
	 * @param userId
	 * @return
	 */
	public User findUserByUserId(int userId);
	
	/**
	 * 
	 * 
	 */
	public User findUserByUserName(String userName);
	
	
	
	public void delete(User user);

}
