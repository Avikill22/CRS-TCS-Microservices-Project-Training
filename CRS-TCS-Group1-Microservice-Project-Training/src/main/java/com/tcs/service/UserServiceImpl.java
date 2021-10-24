/**
 * 
 */
package com.tcs.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.bean.Student;
import com.tcs.bean.User;
import com.tcs.dao.UserDAOInterface;
import com.tcs.exception.UserNotFoundException;
import com.tcs.exception.UserNotRegisteredException;

/**
 * @author Avinash Gupta
 *
 */
@Component
public class UserServiceImpl implements UserServiceInterface {
	@Autowired
	private UserDAOInterface userObj; 
	
	@Override
	public List list() throws SQLException{
		return userObj.list();
	}
	@Override
	public User createUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUser(int id) throws SQLException {
		return userObj.deleteUser(id);
	}

	@Override
	public User insertUser(User user) throws SQLException, UserNotRegisteredException {
		// TODO Auto-generated method stub
		return userObj.insertUser(user);
	}

	@Override
	public boolean userlogin(String name,String password) throws SQLException, UserNotFoundException {
		return userObj.userLogin(name,password);
	}

}
