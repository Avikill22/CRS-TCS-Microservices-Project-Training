/**
 * 
 */
package com.tcs.dao;

import java.sql.SQLException;
import java.util.List;

import com.tcs.bean.Student;
import com.tcs.exception.StudentNotRegisteredException;

/**
 * @author ashwi
 *
 */

public interface StudentDAOInterface {
	/**
	 * 
	 * @return list of all student object 
	 * @throws SQLException
	 */
	public List list() throws SQLException;
	/**
	 * Method to retrieve Student Details from Student Id
	 * @param StudentId
	 * @return Student Details
	 */
	public Student getId(int id) throws SQLException; 
	
	/**
	 * Method to add student to database
	 * @param student: student object containing all the fields
	 * @return true if student is added, else false
	 * @throws StudentNotRegisteredException
	 */
	public Student insert(Student student) throws SQLException, StudentNotRegisteredException;
	/**
	 * @return the students
	 * @throws SQLException 
	 */
	public Student update(int id, Student student) throws SQLException;
}
