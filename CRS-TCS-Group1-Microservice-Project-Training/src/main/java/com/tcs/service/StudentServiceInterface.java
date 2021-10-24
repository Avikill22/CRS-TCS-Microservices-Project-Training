/**
 * 
 */
package com.tcs.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tcs.bean.Student;
import com.tcs.exception.StudentNotRegisteredException;

/**
 * @author ashwi
 *
 */
public interface StudentServiceInterface {
	public List studentList() throws SQLException;
	public Student getId(int id) throws SQLException;


	public Student insert(Student student) throws SQLException, StudentNotRegisteredException;
	public Student update(int id, Student student)throws SQLException;
	
}
