/**
 * 
 */
package com.tcs.bean;

/**
 * @author ganes
 *
 */
public class Grade {
	private int gradeId;
	private float cgpa;
	private String grades;
	/**
	 * @param gradeId
	 * @param cgpa
	 * @param grades
	 */
	public Grade(int gradeId, float cgpa, String grades) {
		super();
		this.gradeId = gradeId;
		this.cgpa = cgpa;
		this.grades = grades;
	}
	
	/**
	 * @return the gradeId
	 */
	public int getGradeId() {
		return gradeId;
	}
	/**
	 * @param gradeId the gradeId to set
	 */
	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}
	/**
	 * @return the cgpa
	 */
	public float getCgpa() {
		return cgpa;
	}
	/**
	 * @param cgpa the cgpa to set
	 */
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	/**
	 * @return the grades
	 */
	public String getGrades() {
		return grades;
	}
	/**
	 * @param grades the grades to set
	 */
	public void setGrades(String grades) {
		this.grades = grades;
	}
	

}
