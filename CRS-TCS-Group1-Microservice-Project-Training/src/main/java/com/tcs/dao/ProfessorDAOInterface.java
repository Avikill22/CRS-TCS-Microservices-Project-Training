/**
 * 
 */
package com.tcs.dao;

import com.tcs.bean.Course;
import com.tcs.bean.Student;

/**
 * @author Avinash Gupta
 *
 */
public interface ProfessorDAOInterface {
	public Student viewEnrolledStudents();
	public void addGrade(Course course,Student student);
}
