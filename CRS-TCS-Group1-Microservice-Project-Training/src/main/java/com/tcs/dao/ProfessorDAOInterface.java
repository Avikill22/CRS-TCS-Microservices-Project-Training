/**
 * 
 */
package com.tcs.dao;

import java.sql.SQLException;
import java.util.List;

import com.tcs.bean.Professor;
/**
 * @author ganes
 *
 */
public interface ProfessorDAOInterface {
	//public void viewEnrolledCourses();
	//public void addGrades();
	/**
	 * Method to get list of professors
	 * @param professorId
	 * @return list
	 */
	public List list() throws SQLException;
	/**
	 * Method to get list of professors by id
	 * @param professorId
	 * @return list by id
	 */
	public Professor get(int id) throws SQLException;
	/**
	 * Method to delete 
	 * @param professorId
	 * @return list of remaining
	 */
	public Professor delete(int id) throws SQLException;
	/**
	 * Method to update
	 * @param professorId
	 * @return list of updated professors
	 */
	public Professor update(int id, Professor professor) throws SQLException;
	/**
	 * Method to insert
	 * @param professorId
	 * @return list of inserted
	 */
	public Professor insert(Professor professor) throws SQLException;
	
	
	
}