/**
 * 
 */
package com.tcs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.tcs.bean.Student;
import com.tcs.constant.SQLQueriesConstants;
import com.tcs.exception.StudentNotRegisteredException;
import com.tcs.util.DBUtils;

/**
 * @author ashwi
 *
 */
@Repository
public class StudentDAOImpl implements StudentDAOInterface {
	private static Logger logger = Logger.getLogger(StudentDAOImpl.class);
	private PreparedStatement statement = null;
	Connection con = DBUtils.getConnection();
	SQLQueriesConstants sql = new SQLQueriesConstants();

	@Override
	public List list() throws SQLException {
		List<Student> students = new ArrayList<Student>();
		PreparedStatement stmt = con.prepareStatement(sql.VIEW_LIST_STUDENTS);
		System.out.println("Database Connected......");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			students.add(new Student(rs.getInt(1), rs.getString(2), rs.getString(3),
					rs.getString(4), rs.getString(5), rs.getString(6),rs.getInt(7),rs.getInt(8),rs.getString(9)));
		}
		return students;
	}

	@Override
	public Student getId(int id) throws SQLException {
		// TODO Auto-generated method stub
		String s = sql.VIEW_SELECTED_STUDENT + id;
		PreparedStatement stmt = con.prepareStatement(s);

		logger.info("Database Connected......");
		ResultSet rs = stmt.executeQuery();
		if (rs.next())
			return new Student(rs.getInt(1), rs.getString(2), rs.getString(3),
					rs.getString(4), rs.getString(5), rs.getString(6),rs.getInt(7),rs.getInt(8),rs.getString(9));
		return null;
	}

	

	@Override
	public Student insert(Student student) throws StudentNotRegisteredException {
		// TODO Auto-generated method stub
		try {
			PreparedStatement stmt=con.prepareStatement(sql.INSERT_DATA);
			stmt.setInt(1,student.getStudentId());
			stmt.setString(2,student.getStudentName());
			stmt.setString(3,student.getStudentDept());
			stmt.setString(4,student.getStudentSem());
			stmt.setString(5, student.getStudentYoj());
			stmt.setString(6, student.getStudentPhNo());
			stmt.setInt(7,student.getUserId());
			stmt.setInt(8, student.getCourseId());
			stmt.setString(9, "Pending");
			int i = stmt.executeUpdate();
		}catch(Exception e) {
			throw new StudentNotRegisteredException(e.getMessage());
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
		return student;
		}

	@Override
	public Student update(int id, Student student) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement stmt = con.prepareStatement(SQLQueriesConstants.UPDATE_STUDENT);

		stmt.setInt(2, id);
		stmt.setString(1, student.getApprove());
	
		int i = stmt.executeUpdate();
		return student;
	}
	
	/*
	 * Connection con = DBUtils.getConnection(); SQLQueriesConstants sql = new
	 * SQLQueriesConstants();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * // @Override // public Student create(Student student) { //
	 * student.setStudentId(101); // students.add(student); // return student; // }
	 * //
	 * 
	 * @Override public List list() throws SQLException { // TODO Auto-generated
	 * method stub List<Student> students = new ArrayList<Student>();
	 * PreparedStatement stmt = con.prepareStatement(sql.VIEW_LIST_STUDENTS);
	 * System.out.println("Database Connected......"); ResultSet rs =
	 * stmt.executeQuery(); while(rs.next()) { students.add(new
	 * Student(rs.getInt(1),rs.getString(2),rs.getString(3))); } return students; }
	 * 
	 * @Override public Student getId(int id) throws SQLException { // TODO
	 * Auto-generated method stub String s = sql.VIEW_SELECTED_STUDENT+ id;
	 * PreparedStatement stmt = con.prepareStatement(s);
	 * 
	 * System.out.println("Database Connected......"); ResultSet rs=
	 * stmt.executeQuery(); if (rs.next()) return new
	 * Student(rs.getInt("studentId"),rs.getString("studentRollNo"),rs.getString(
	 * "studentDept")); return null; }
	 * 
	 * @Override public Student delete(int id) throws SQLException { // TODO
	 * Auto-generated method stub String s = sql.VIEW_SELECTED_STUDENT+ id;
	 * PreparedStatement stmt = con.prepareStatement(s); ResultSet rs=
	 * stmt.executeQuery(); stmt =
	 * con.prepareStatement(sql.DELETE_SELECTED_ID_STUDENT_DATA); stmt.setInt(1,
	 * id); stmt.execute();
	 * 
	 * if (rs.next()) return new
	 * Student(rs.getInt("studentId"),rs.getString("studentRollNo"),rs.getString(
	 * "studentDept")); return null; }
	 * 
	 * @Override public Student insert(Student student) throws SQLException { //
	 * TODO Auto-generated method stub PreparedStatement
	 * stmt=con.prepareStatement("insert into students values(?,?,?)");
	 * stmt.setInt(1,student.getStudentId());
	 * stmt.setString(2,student.getStudentName());
	 * stmt.setString(3,student.getStudentDept());
	 * 
	 * int i = stmt.executeUpdate(); return student; }
	 * 
	 * @Override public Student update(int id, Student student) throws SQLException
	 * { // TODO Auto-generated method stub PreparedStatement stmt=con.
	 * prepareStatement("update students set studentRollNo=?, studentDept=? where studentId=?"
	 * ); stmt.setString(1,student.getStudentName());//1 specifies the first
	 * parameter in the query i.e. name stmt.setString(2,student.getStudentDept());
	 * stmt.setInt(3, id ); int i = stmt.executeUpdate();
	 * 
	 * return student;
	 * 
	 * }
	 */

}