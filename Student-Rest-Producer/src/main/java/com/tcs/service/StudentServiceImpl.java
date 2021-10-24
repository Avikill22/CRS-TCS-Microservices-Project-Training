/**
 * 
 */
package com.tcs.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.tcs.bean.Student;
import com.tcs.dao.StudentDAOInterface;
import com.tcs.exception.StudentNotRegisteredException;

/**
 * @author ashwi
 *
 */
@Component
@Service
public class StudentServiceImpl implements StudentServiceInterface{

	@Autowired
	private StudentDAOInterface students;
	@Override
	public List studentList() throws SQLException {
		// TODO Auto-generated method stub
		return students.list();
	}

	@Override
	public Student getId(int id) throws SQLException {
		// TODO Auto-generated method stub
		return students.getId(id);
	}

	

	@Override
	public Student insert(Student student) throws SQLException, StudentNotRegisteredException {
		// TODO Auto-generated method stub
		return students.insert(student);
	}

	@Override
	public Student update(int id, Student student) throws SQLException {
		// TODO Auto-generated method stub
		return students.update(id, student);
	}

}