/**
 * 
 */
package com.tcs.bean;

/**
 * @author ganes
 *
 */
public class Professor {
	private int professorId;
	/**
	 * @param professorId
	 * @param professorName
	 */
	public Professor(int professorId, String professorName) {
		super();
		this.professorId = professorId;
		this.professorName = professorName;
	}
	private String professorName;
	/**
	 * @return the professorId
	 */
	public int getProfessorId() {
		return professorId;
	}
	/**
	 * @param professorId the professorId to set
	 */
	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}
	/**
	 * @return the professorName
	 */
	public String getProfessorName() {
		return professorName;
	}
	/**
	 * @param professorName the professorName to set
	 */
	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}
	

}