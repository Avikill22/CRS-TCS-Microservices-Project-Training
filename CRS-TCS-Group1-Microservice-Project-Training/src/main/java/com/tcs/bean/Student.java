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
	private int userId;
	private int courseId;
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
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the courseId
	 */
	public int getCourseId() {
		return courseId;
	}

	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(int courseId) {
		this.courseId = courseId;
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
		String studentPhNo, int userId, int courseId, String approve) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentDept = studentDept;
	this.studentSem = studentSem;
	this.studentYoj = studentYoj;
	this.studentPhNo = studentPhNo;
	this.userId = userId;
	this.courseId = courseId;
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