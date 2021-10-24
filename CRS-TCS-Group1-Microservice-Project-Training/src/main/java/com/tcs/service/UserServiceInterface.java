/**
 * 
 */
package com.tcs.service;

import java.sql.SQLException;
import java.util.List;

import com.tcs.bean.User;
import com.tcs.exception.UserNotFoundException;
import com.tcs.exception.UserNotRegisteredException;

/**
 * @author Avinash Gupta
 *
 */
public interface UserServiceInterface {
	public User createUser();
	public List list() throws SQLException;
	boolean userlogin(String name, String password) throws SQLException, UserNotFoundException;
	public User deleteUser(int id) throws SQLException;
	public User insertUser(User user) throws SQLException, UserNotRegisteredException;
}
