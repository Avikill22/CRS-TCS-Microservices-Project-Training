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
//	public int delete(int id);
//	public Student update(int id, Student student);
//	public void insert(Student student);
}
