/**
 * 
 */
package com.tcs.service;

import com.tcs.bean.User;

/**
 * @author Avinash Gupta
 *
 */
public interface UserServiceInterface {
	public User createUser();
	public boolean deleteUser();
	public User updateUser();
}
