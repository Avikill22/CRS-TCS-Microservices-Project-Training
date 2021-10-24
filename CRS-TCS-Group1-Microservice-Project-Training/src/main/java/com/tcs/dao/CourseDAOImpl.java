package com.tcs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.tcs.bean.Course;
import com.tcs.bean.Student;
import com.tcs.constant.SQLQueriesConstants;
import com.tcs.util.DBUtils;
@Repository
public class CourseDAOImpl implements CourseDAOInterface{
	private static Logger logger = Logger.getLogger(CourseDAOImpl.class);
	private PreparedStatement statement = null;
	Connection con = DBUtils.getConnection();
	SQLQueriesConstants sql = new SQLQueriesConstants();

	@Override
	public List list() throws SQLException {
		// TODO Auto-generated method stub
		
		List<Course> courses = new ArrayList<Course>();
		try {
		PreparedStatement stmt = con.prepareStatement(sql.VIEW_LIST_COURSE);
		logger.info("Database Connected......");
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			courses.add(new Course(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
		}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				logger.info(e.getMessage()+"SQL error");
				e.printStackTrace();
			}
		}
		
		return courses;
	}

	@Override
	public Course getcourseId(int id) throws SQLException {
		// TODO Auto-generated method stub
		try {
		String s = sql.VIEW_SELECTED_COURSE+ id;
		PreparedStatement stmt = con.prepareStatement(s);
		
		logger.info("Database Connected......");
		ResultSet rs= stmt.executeQuery();
		if (rs.next())
			return new Course(rs.getInt("courseId"),rs.getString("courseName"),rs.getString("courseDuration"),rs.getString("department"));
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				logger.info(e.getMessage()+"SQL error");
				e.printStackTrace();
			}
		}
		
		return null;
	}
		

	@Override
	public Course delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		try {
		String s = sql.VIEW_SELECTED_COURSE+ id;
		PreparedStatement stmt = con.prepareStatement(s);
		ResultSet rs= stmt.executeQuery();
		stmt = con.prepareStatement(sql.DELETE_SELECTED_ID_COURSE);
		stmt.setInt(1, id);
		stmt.execute();
		
		if (rs.next())
			return new Course(rs.getInt("courseId"),rs.getString("courseName"),rs.getString("courseDuration"),rs.getString("department"));
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				logger.info(e.getMessage()+"SQL error");
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Course insert(Course course) throws SQLException {
		// TODO Auto-generated method stub
		try {
		
		PreparedStatement stmt=con.prepareStatement("insert into students values(?,?,?,?)");
		stmt.setInt(1,course.getCourseId());
		stmt.setString(2,course.getCourseName());
		stmt.setString(3,course.getCourseDuration());
		stmt.setString(4,course.getDepartment());
		int i = stmt.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				logger.info(e.getMessage()+"SQL error");
				e.printStackTrace();
			}
		}
		return course;
	}

	@Override
	public Course update(int id, Course course) throws SQLException {
		// TODO Auto-generated method stub
		try {
		
		PreparedStatement stmt=con.prepareStatement("update course set courseName=?, courseDuration=?,department=? where courseId=?");  
		stmt.setString(1,course.getCourseName());//1 specifies the first parameter in the query i.e. name  
		stmt.setString(2,course.getCourseDuration());
		stmt.setString(3,course.getDepartment());
		stmt.setInt(4, id );
		int i = stmt.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				logger.info(e.getMessage()+"SQL error");
				e.printStackTrace();
			}
		}
		return course;
	}
	

}