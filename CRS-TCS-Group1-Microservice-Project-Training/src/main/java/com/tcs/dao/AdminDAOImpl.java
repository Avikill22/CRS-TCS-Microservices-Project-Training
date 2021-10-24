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

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.tcs.bean.Admin;
import com.tcs.bean.Student;
import com.tcs.util.*;



import com.tcs.constant.*;

@Repository
public class AdminDAOImpl implements AdminDAOInterface{
	private static Logger logger = Logger.getLogger(AdminDAOImpl.class);
	private PreparedStatement statement = null;

	Connection con = DBUtils.getConnection();
	SQLQueriesConstants sql = new SQLQueriesConstants();
	
	
	@Override
	public List list() throws SQLException {
	
		List<Admin> admins = new ArrayList<Admin>();
		PreparedStatement stmt = con.prepareStatement(sql.VIEW_LIST_ADMINS);
		logger.info("Database Connected......");
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			admins.add(new Admin(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5)));
		}
		
		return admins;
	}

	/**
	 * @return 
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
	@Override
	public Admin delete(int id) throws SQLException {
		String s = sql.VIEW_SELECTED_ADMINS+ id;
		PreparedStatement stmt = con.prepareStatement(s);
		ResultSet rs= stmt.executeQuery();
		stmt = con.prepareStatement(sql.DELETE_SELECTED_ID_ADMINS_DATA);
		stmt.setInt(1, id);
		stmt.execute();
		
		if (rs.next())
			return new Admin(rs.getInt("adminId"),rs.getString("adminName"),rs.getString("phoneNo"),rs.getString("dob"),rs.getInt("userIDD"));
		return null;
			
	}
//
	@Override
	public Admin update(int id, Admin admin) throws SQLException {
		PreparedStatement stmt=con.prepareStatement("update admins set adminName=?, phoneNo=?, dob=?, userIDD=? where adminId=?");  
		stmt.setString(1,admin.getAdminName());//1 specifies the first parameter in the query i.e. name  
		stmt.setString(2,admin.getPhoneNo());
		stmt.setString(3,admin.getDob());
		stmt.setInt(4,admin.getUserIDD());
		stmt.setInt(5, id );
		int i = stmt.executeUpdate();
		
		return admin;
	}
//
	@Override
	public Admin insert(Admin admin) throws SQLException {
		PreparedStatement stmt=con.prepareStatement(sql.INSERT_DATA_ADMINS);
		stmt.setInt(1,admin.getAdminId());
		stmt.setString(2,admin.getAdminName());
		stmt.setString(3,admin.getPhoneNo());
		stmt.setString(4,admin.getDob());
        stmt.setInt(5,admin.getUserIDD());
		int i = stmt.executeUpdate();


		return admin;
	}
//
	@Override
	public Admin getId(int id) throws SQLException {
		String s = sql.VIEW_SELECTED_ADMINS+ id;
		PreparedStatement stmt = con.prepareStatement(s);
		
		System.out.println("Database Connected......");
		ResultSet rs= stmt.executeQuery();
		if (rs.next())
			return new Admin(rs.getInt("adminId"),rs.getString("adminName"),rs.getString("phoneNo"),rs.getString("dob"),rs.getInt("userIDD"));
		return null;
	}
	@Override
	public boolean approveStudents(int id) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement stmt = con.prepareStatement(SQLQueriesConstants.UPDATE_STUDENT);
		
		stmt.setInt(2, id);
		stmt.setString(1, "Aprrove");
		
		int i = stmt.executeUpdate();
		if(i!=0) {
			return true;
		}
		return false;
	}
}
	


