/**
 * 
 */
package com.tcs.bean;

/**
 * @author Avinash Gupta
 *
 */
public class User {
	private int userId;
	private String userName;
	private String password;
	
	
	/**
	 * @param userId
	 * @param userName
	 * @param password
	 */
	
	
	
	
	
	

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId
	 * @param userName
	 * @param password
	 * @param logStatus
	 */
	public User(int userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		
	}
	
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
