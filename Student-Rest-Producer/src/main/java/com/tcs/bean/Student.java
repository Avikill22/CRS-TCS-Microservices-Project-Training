/**
 * 
 */
package com.tcs.bean;

/**
 * @author ashwi
 *
 */
public class Student {
	private int studentId;
	private String studentName;
	private String studentDept;
	private String studentSem;
	
	private String studentYoj;
	private String studentPhNo;
	private int uId;
	private int couId;
	private String approve;
	/**
	 * @return the approve
	 */
	public String getApprove() {
		return approve;
	}

	/**
	 * @param approve the approve to set
	 */
	public void setApprove(String approve) {
		this.approve = approve;
	}

/**
	 * @return the userId
	 */
	public int getUId() {
		return uId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUId(int userId) {
		this.uId = uId;
	}

	/**
	 * @return the courseId
	 */
	public int getCouId() {
		return couId;
	}

	/**
	 * @param courseId the courseId to set
	 */
	public void setCouId(int couId) {
		this.couId = couId;
	}

public Student() {
	
}

	
/**
 * @param studentId
 * @param studentName
 * @param studentDept
 * @param studentSem
 * @param studentYoj
 * @param studentPhNo
 * @param userId
 * @param courseId
 * @param approve
 */
public Student(int studentId, String studentName, String studentDept, String studentSem, String studentYoj,
		String studentPhNo, int uId, int couId, String approve) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentDept = studentDept;
	this.studentSem = studentSem;
	this.studentYoj = studentYoj;
	this.studentPhNo = studentPhNo;
	this.uId = uId;
	this.couId = couId;
	this.approve = approve ;
}

/**
	 * @return the studentSem
	 */
	public String getStudentSem() {
		return studentSem;
	}
	/**
	 * @param studentSem the studentSem to set
	 */
	public void setStudentSem(String studentSem) {
		this.studentSem = studentSem;
	}
	/**
	 * @return the studentYoj
	 */
	public String getStudentYoj() {
		return studentYoj;
	}
	/**
	 * @param studentYoj the studentYoj to set
	 */
	public void setStudentYoj(String studentYoj) {
		this.studentYoj = studentYoj;
	}
	/**
	 * @return the studentPhNo
	 */
	public String getStudentPhNo() {
		return studentPhNo;
	}
	/**
	 * @param studentPhNo the studentPhNo to set
	 */
	public void setStudentPhNo(String studentPhNo) {
		this.studentPhNo = studentPhNo;
	}

	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the studentDept
	 */
	public String getStudentDept() {
		return studentDept;
	}
	/**
	 * @param studentDept the studentDept to set
	 */
	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}
	
}