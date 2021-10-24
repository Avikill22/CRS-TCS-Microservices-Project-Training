/**
 * 
 */
package com.tcs.bean;

/**
 * @author Avinash Gupta
 *
 */
public class Admin {
	/**
	 * @return the adminId
	 */
	private int adminId;
	private String adminName;
	private String phoneNo;
	private String dob; 
	private int userIDD;
	public Admin() {
		
	}
	public Admin(int adminId, String adminName, String phoneNo, String dob, int userIDD) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.phoneNo = phoneNo;
		this.dob = dob;
		this.userIDD = userIDD;
	}
	/**
	 * @return the adminId
	 */
	public int getAdminId() {
		return adminId;
	}
	/**
	 * @param adminId the adminId to set
	 */
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	/**
	 * @return the adminName
	 */
	public String getAdminName() {
		return adminName;
	}
	/**
	 * @param adminName the adminName to set
	 */
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}
	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	/**
	 * @return the userIDD
	 */
	public int getUserIDD() {
		return userIDD;
	}
	/**
	 * @param userIDD the userIDD to set
	 */
	public void setUserIDD(int userIDD) {
		this.userIDD = userIDD;
	}
	
}