/**
 * 
 */
package com.tcs.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.bean.Student;
import com.tcs.dao.StudentDAOInterface;

/**
 * @author Avinash Gupta
 *
 */
@Component
public class StudentServiceImpl implements StudentServiceInterface {
	@Autowired 
	private StudentDAOInterface students;

	@Override
	public List studentList() throws SQLException {
		// TODO Auto-generated method stub
		return students.list();
	}

//	@Override
//	public List studentList() {
//		// TODO Auto-generated method stub
//		return students.list();
//	}
	@Override
	public Student getId(int id) throws SQLException {
		
		return students.getId(id);
	}
//
//	@Override
//	public Student create(Student student) {
//		// TODO Auto-generated method stub
//		return students.create(student);
//	}
//
//	@Override
//	public Long delete(int id) {
//		// TODO Auto-generated method stub
//		return  students.delete(id);
//	}
//
//	@Override
//	public Student update(int id, Student student) {
//		// TODO Auto-generated method stub
//		return students.update(id, student);
//	}
//
//	@Override
//	public void insert(Student student) {
//		students.insert(student);
//	}
	
	
}
