/**
 * 
 */
package com.tcs.dao;

import java.sql.SQLException;
import java.util.List;

import com.tcs.bean.Course;

import com.tcs.bean.Student;

/**
 * @author Avinash Gupta
 *
 */
public interface StudentDAOInterface {
	public List list() throws SQLException;
	public Student getId(int id) throws SQLException; 
//	public Student create(Student student);
	public Student delete(int id) throws SQLException;
//	public Student update(int id, Student student);
	public Student insert(Student student) throws SQLException;
	/**
	 * @return the students
	 * @throws SQLException 
	 */
	public Student update(int id, Student student) throws SQLException;
}
