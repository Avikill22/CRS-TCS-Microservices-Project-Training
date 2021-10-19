/**
 * 
 */
package com.tcs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tcs.bean.Student;
import com.tcs.util.*;
import com.tcs.constant.*;

@Repository
public class StudentDAOImpl implements StudentDAOInterface{
	Connection con = DBUtils.getConnection();
	SQLQueriesConstants sql = new SQLQueriesConstants();
	
	
	@Override
	public List list() throws SQLException {
		List<Student> students = new ArrayList<Student>();
		PreparedStatement stmt = con.prepareStatement(sql.VIEW_LIST_STUDENTS);
		System.out.println("Database Connected......");
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			students.add(new Student(rs.getInt(1),rs.getString(2),rs.getString(3)));
		}
		return students;
	}

	/**
	 * @return the students
	 * @throws SQLException 
	 */
	

//	@Override
//	public Student create(Student student) {
//		student.setStudentId(101);
//		students.add(student);
//		return student;
//	}
//
//	@Override
//	public Student delete(int id) throws SQLException {
//		PreparedStatement stmt = con.prepareStatement(sql.DELETE_SELECTED_ID_STUDENT_DATA);
//		stmt.setInt(1, id);
//			
//			if(stmt.executeUpdate()!=0) {
//				return 
//			};
//			
//			return null;
//			
//	}
//
	@Override
	public Student update(int id, Student student) throws SQLException {
		PreparedStatement stmt=con.prepareStatement("update students set studentRollNo=?, studentDept=? where studentId=?");  
		stmt.setString(1,student.getStudentRollNo());//1 specifies the first parameter in the query i.e. name  
		stmt.setString(2,student.getStudentDept());
		stmt.setInt(3, id );
		int i = stmt.executeUpdate();
		
		return student;
	}
//
	@Override
	public Student insert(Student student) throws SQLException {
		PreparedStatement stmt=con.prepareStatement("insert into students values(?,?,?)");
		stmt.setInt(1,student.getStudentId());
		stmt.setString(2,student.getStudentRollNo());
		stmt.setString(3,student.getStudentDept());
		
		int i = stmt.executeUpdate();
		return student;
	}
//
	@Override
	public Student getId(int id) throws SQLException {
		String s = sql.VIEW_SELECTED_STUDENT+ id;
		PreparedStatement stmt = con.prepareStatement(s);
		
		System.out.println("Database Connected......");
		ResultSet rs= stmt.executeQuery();
		if (rs.next())
			return new Student(rs.getInt("studentId"),rs.getString("studentRollNo"),rs.getString("studentDept"));
		return null;
	}
	

}
