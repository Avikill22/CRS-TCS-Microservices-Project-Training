/**
 * 
 */
package com.tcs.service;
import com.tcs.bean.Course;
import com.tcs.bean.Student;

/**
 * @author Avinash Gupta
 *
 */
public interface ProfessorServiceInterface {
	public Student viewEnrolledStudents();
	public void addGrade(Course course,Student student);
}





