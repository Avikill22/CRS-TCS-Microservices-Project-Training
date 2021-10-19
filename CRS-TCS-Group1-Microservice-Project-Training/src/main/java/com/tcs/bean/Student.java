/**
 * 
 */
package com.tcs.bean;

/**
 * @author Avinash Gupta
 *
 */
public class Student {
	private int studentId;
	private String studentRollNo;
	private String studentDept;
	
	/**
	 * @param studentId
	 * @param studentRollNo
	 * @param studentDept
	 */
	public Student(int studentId, String studentRollNo, String studentDept) {
		super();
		this.studentId = studentId;
		this.studentRollNo = studentRollNo;
		this.studentDept = studentDept;
	}
	/**
	 * @return the studentId
	 */
	public Student() {
		
	}
	/**
	 * @param l the studentId to set
	 */
	public void setStudentId(int l) {
		this.studentId = l;
	}
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * @return the studentRollNo
	 */
	public String getStudentRollNo() {
		return studentRollNo;
	}
	/**
	 * @param studentRollNo the studentRollNo to set
	 */
	public void setStudentRollNo(String studentRollNo) {
		this.studentRollNo = studentRollNo;
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
	
	/**
	 * @return the studentId
	 */
	
	
}
