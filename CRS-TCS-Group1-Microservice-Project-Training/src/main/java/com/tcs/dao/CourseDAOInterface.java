package com.tcs.dao;

import java.sql.SQLException;
import java.util.List;

import com.tcs.bean.Course;

public interface CourseDAOInterface {
	/**
	 * Method to retrieve complete courses 
	 */
	public List list() throws SQLException;
	/**
	 * Method to retrieve courseId 
	 * @param id
	 * @return course Id
	 */
	public Course getcourseId(int id) throws SQLException;
	/**
	 * Method to delete course using
	 * @param Id
	 * @return courseId
	 */
	public Course delete(int id) throws SQLException;
	/**
	 * Method to insert complete object of course
	 * @param course
	 * @return object
	 */
	public Course insert(Course course) throws SQLException;
	/**
	 * Method to update
	 * @param id,course
	 * @return course object
	 */
	public Course update(int id, Course course) throws SQLException;

}
