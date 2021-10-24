/**
 * 
 */
package com.tcs.service;

import java.sql.SQLException;
import java.util.List;

import com.tcs.bean.Professor;
import com.tcs.exception.ProfessorNotAdded;

/**
 * @author ganes
 *
 */
public interface ProfessorServiceInterface {
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
	 * @throws ProfessorNotAdded 
	 */
	public Professor delete(int id) throws SQLException, ProfessorNotAdded;
	/**
	 * Method to update
	 * @param professorId
	 * @return list of updated professors
	 * @throws ProfessorNotAdded 
	 */
	public Professor update(int id, Professor professor) throws SQLException, ProfessorNotAdded;
	/**
	 * Method to insert
	 * @param professorId
	 * @return list of inserted
	 * @throws ProfessorNotAdded 
	 */
	public Professor insert(Professor professor) throws SQLException, ProfessorNotAdded;
	
	
}





