/**
 * 
 */
package com.tcs.dao;

import java.sql.SQLException;
import java.util.List;

import com.tcs.bean.User;
import com.tcs.exception.StudentNotRegisteredException;
import com.tcs.exception.UserNotFoundException;
import com.tcs.exception.UserNotRegisteredException;

/**
 * @author Avinash Gupta
 *
 */
public interface UserDAOInterface {
	
	
	//public User updateUser();
	public User insertUser(User user) throws SQLException, UserNotRegisteredException;
	boolean userLogin(String name, String password) throws SQLException, UserNotFoundException;
	public List list() throws SQLException;
	public User deleteUser(int id) throws SQLException;
	
}
