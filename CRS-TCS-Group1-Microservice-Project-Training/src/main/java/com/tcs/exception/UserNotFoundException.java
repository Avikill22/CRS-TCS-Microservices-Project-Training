/**
 * 
 */
package com.tcs.exception;

/**
 * @author Avinash Gupta
 *
 */
public class UserNotFoundException extends Exception {
	private String UserName;
	public UserNotFoundException (String UserName) {
		this.UserName = UserName;
	}
	
	@Override
	public String getMessage() {
		return "User with userName :" + UserName + " not found.";
	}
}
