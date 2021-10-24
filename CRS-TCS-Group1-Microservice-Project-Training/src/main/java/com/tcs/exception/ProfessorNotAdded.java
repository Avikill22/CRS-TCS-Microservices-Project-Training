/**
 * 
 */
package com.tcs.exception;

/**
 * @author Avinash Gupta
 *
 */
public class ProfessorNotAdded extends Exception{
private String professorId;
	
	public ProfessorNotAdded(String id) {
		professorId = id;
	}
	
	/**
	 * Getter function for professorId
	 * @return
	 */
	public String getUserId() {
		return this.professorId;
	}
	

	/**
	 * Message returned when exception is thrown
	 */
	@Override
	public String getMessage() {
		return "professorId: " + professorId + " not added!";
	}
}
