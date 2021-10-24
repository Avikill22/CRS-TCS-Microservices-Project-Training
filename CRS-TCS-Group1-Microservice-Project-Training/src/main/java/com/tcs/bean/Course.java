/**
 * 
 */
package com.tcs.bean;

/**
 * @author Avinash Gupta
 *
 */
public class Course {
	private int courseId;
	private String courseName;
	
	private String courseDuration;
	private String department;
	
	/**
	 * @return the courseId
	 */
	public Course(int courseId,String courseName,String courseDuration,String department) {
		this.courseId=courseId;
		this.courseName=courseName;
		this.courseDuration=courseDuration;
		this.department=department;
	}
	public Course() {}
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
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * @return the courseDuration
	 */
	public String getCourseDuration() {
		return courseDuration;
	}
	/**
	 * @param courseDuration the courseDuration to set
	 */
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
		
		
	
	
	
	
}