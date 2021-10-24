package com.tcs.service;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.tcs.bean.Admin;
import com.tcs.dao.AdminDAOInterface;

/**
 * @author Avinash Gupta
 *
 */
@Component
public class AdminServiceImpl implements AdminServiceInterface {
	private static Logger logger = Logger.getLogger(AdminServiceImpl.class);
	private PreparedStatement statement = null;
	@Autowired 
	private AdminDAOInterface admins;
	@Override
	public List adminList() throws SQLException {
		// TODO Auto-generated method stub
		return admins.list();
	}

//	@Override
//	public List studentList() {
//		// TODO Auto-generated method stub
//		return students.list();
//	}
	@Override
	public Admin getId(int id) throws SQLException {
		
		return admins.getId(id);
	}
//
//	@Override
//	public Student create(Student student) {
//		// TODO Auto-generated method stub
//		return students.create(student);
//	}
//
	@Override
	public Admin delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return admins.delete(id);
	}
//
	@Override
	public Admin update(int id, Admin admin)throws SQLException {
		// TODO Auto-generated method stub
		return admins.update(id, admin);
	}
//
	@Override
	public Admin insert(Admin admin) throws SQLException {
		return admins.insert(admin);
	}
	@Override
	public boolean approve(int id) throws SQLException{
		return admins.approveStudents(id);
	}
//@Override
//public Student delete(int id) throws SQLException {
//	// TODO Auto-generated method stub
//	return null;
//}
	
	
}