/**
 * 
 */
package com.tcs.dao;

import com.tcs.bean.User;

/**
 * @author Avinash Gupta
 *
 */
public interface UserDAOInterface {
	public User createUser();
	public boolean deleteUser();
	public User updateUser();
	
}
