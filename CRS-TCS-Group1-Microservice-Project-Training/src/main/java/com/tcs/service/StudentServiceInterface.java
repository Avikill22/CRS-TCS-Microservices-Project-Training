/**
 * 
 */
package com.tcs.service;

import java.sql.SQLException;
import java.util.List;

import com.tcs.bean.Course;
import com.tcs.bean.Student;

/**
 * @author Avinash Gupta
 *
 */
public interface StudentServiceInterface {
	public List studentList() throws SQLException;
	public Student getId(int id) throws SQLException;
//	public Student create(Student student);
//	public Long delete(Long id);
//	public Student update(Long id, Student student);
//	public void insert(Student student);
	
}
