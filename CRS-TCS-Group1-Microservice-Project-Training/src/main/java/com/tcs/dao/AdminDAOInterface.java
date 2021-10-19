/**
 * 
 */
package com.tcs.dao;

import com.tcs.bean.Course;

/**
 * @author Avinash Gupta
 *
 */
public interface AdminDAOInterface {
	public void addCourse(Course course);
	public void removeCourse();
}
