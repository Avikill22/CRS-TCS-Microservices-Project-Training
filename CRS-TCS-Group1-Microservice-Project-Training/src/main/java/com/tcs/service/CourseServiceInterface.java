package com.tcs.service;

import java.sql.SQLException;
import java.util.List;

import com.tcs.bean.Course;
import com.tcs.exception.CourseNotFoundException;

public interface CourseServiceInterface {
	/**
	 * Method to retrieve complete courses 
	 */
	public List courseList() throws SQLException;
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
	 * @throws CourseNotFoundException 
	 */
	public Course delete(int id) throws SQLException, CourseNotFoundException;
	/**
	 * Method to insert complete object of course
	 * @param course
	 * @return object
	 * @throws CourseNotFoundException 
	 */
	public Course insert(Course course) throws SQLException, CourseNotFoundException;
	/**
	 * Method to update
	 * @param id,course
	 * @return course object
	 */
	public Course update(int id, Course course) throws SQLException;


}