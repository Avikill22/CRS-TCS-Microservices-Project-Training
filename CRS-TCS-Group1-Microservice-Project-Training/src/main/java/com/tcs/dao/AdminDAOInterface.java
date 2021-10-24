package com.tcs.dao;

import java.sql.SQLException;
import java.util.List;

import com.tcs.bean.Admin;



/**
 * @author Avinash Gupta
 *
 */
public interface AdminDAOInterface {
	/**
	 * Method to add student to database
	 * @return admin object containing all the fields
	 * @throws SQLException
	 */
	public List list() throws SQLException;
	/**
	 * Method to retrieve data of a particular admin 
	 * @param int: admin id 
	 * @return Admin object if admin is found, else null
	 * @throws SQLException
	 */
	public Admin getId(int id) throws SQLException; 
	/**
	 * Method to delete the data of a particular admin
	 * @param int: admin id 
	 * @return Admin object if admin is found, else null
	 * @throws SQLException
	 */
	public Admin delete(int id) throws SQLException;
	/**
	 * Method to insert the data of a particular admin
	 * @param Admin: Admin object
	 * @return Admin object 
	 * @throws SQLException
	 */
	public Admin insert(Admin admin) throws SQLException;
	/**
	 * Method to update the data of a particular admin
	 * @param int, Admin: admin id ,object
	 * @return Admin object if admin is found, else null
	 * @throws SQLException
	 */
	public Admin update(int id, Admin admin) throws SQLException;
	public boolean approveStudents(int id) throws SQLException;
}
