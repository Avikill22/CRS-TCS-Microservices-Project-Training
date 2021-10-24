/**
 * 
 */
package com.tcs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.tcs.bean.Grade;
import com.tcs.constant.SQLQueriesConstants;
import com.tcs.util.DBUtils;

/**
 * @author ganes
 *
 */
@Repository
public class GradeCardDAOImpl implements GradeCarddaoInterface{
	private static Logger logger = Logger.getLogger(ProfessorDAOImpl.class);
	Connection con = DBUtils.getConnection();
	SQLQueriesConstants sql = new SQLQueriesConstants();
	@Override
	public Grade updateGrade(int id,Grade grade) throws SQLException {
		// TODO Auto-generated method stub
		try {
		PreparedStatement stmt=con.prepareStatement("update gradecard set cgpa=?, grades=? where gradeId=?");  
		stmt.setFloat(1,grade.getCgpa());//1 specifies the first parameter in the query i.e. name  
		stmt.setString(2,grade.getGrades());
		stmt.setInt(3, id );
		int i = stmt.executeUpdate();
		}catch(SQLException e)
		{
		logger.error(e.getMessage());
	}
	finally
	{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return grade;	
	}
	@Override
	public Grade addGrade(Grade grade) throws SQLException {
		// TODO Auto-generated method stub
		try {
		PreparedStatement stmt=con.prepareStatement("insert into gradecard values(?,?,?)");
		stmt.setInt(1,grade.getGradeId());
		stmt.setFloat(2,grade.getCgpa());
		stmt.setString(3,grade.getGrades());
		int i = stmt.executeUpdate();
		}catch(SQLException e)
		{
		logger.error(e.getMessage());
	}
	finally
	{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return grade;
	}
	
}
