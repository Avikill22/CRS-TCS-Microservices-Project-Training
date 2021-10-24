/**
 * 
 */
package com.tcs.exception;

/**
 * @author Avinash Gupta
 *
 */
public class UserNotRegisteredException extends Exception  {
	private String UserName;
	public UserNotRegisteredException (String UserName) {
		this.UserName = UserName;
	}
	@Override
	public String getMessage() {
		return "User with userName :" + UserName + " not found.";
	}
}
