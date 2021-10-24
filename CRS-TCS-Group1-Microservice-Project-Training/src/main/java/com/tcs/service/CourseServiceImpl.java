/**
 * 
 */
package com.tcs.service;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.bean.Course;
import com.tcs.dao.CourseDAOInterface;
import com.tcs.dao.StudentDAOInterface;
import com.tcs.exception.CourseNotFoundException;

/**
 * @author saima
 *
 */
@Component
public class CourseServiceImpl implements CourseServiceInterface {
	private static Logger logger = Logger.getLogger(CourseServiceImpl.class);
	private PreparedStatement statement = null;
	@Autowired
	private CourseDAOInterface courses;

	@Override
	public List courseList() throws SQLException {
		// TODO Auto-generated method stub
		return courses.list();
	}

	@Override
	public Course getcourseId(int id) throws SQLException {
		// TODO Auto-generated method stub
		return courses.getcourseId(id);
	}

	@Override
	public Course delete(int id) throws CourseNotFoundException,SQLException {
		// TODO Auto-generated method stub
		return courses.delete(id);
	}

	@Override
	public Course insert(Course course) throws CourseNotFoundException,SQLException {
		// TODO Auto-generated method stub
		return courses.insert(course);
	}

	@Override
	public Course update(int id, Course course) throws SQLException {
		// TODO Auto-generated method stub
		return courses.update(id, course);
	}
	

}