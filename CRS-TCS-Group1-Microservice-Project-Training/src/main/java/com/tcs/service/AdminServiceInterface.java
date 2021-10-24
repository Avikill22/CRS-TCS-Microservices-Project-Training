/**
 * 
 */
package com.tcs.service;

import java.sql.SQLException;
import java.util.List;

import com.tcs.bean.Admin;


/**
 * @author Avinash Gupta
 *
 */
public interface AdminServiceInterface {
	/**
	 * Method to call the list method in AdminDAO
	 * @return Admin object if admin is found, else null
	 * @throws SQLException
	 */
	public List adminList() throws SQLException;
	/**
	 * Method to call getID method in AdminDAO
	 * @param int: admin id 
	 * @return Admin object if admin is found, else null
	 * @throws SQLException
	 */
	public Admin getId(int id) throws SQLException;
	/**
	 * Method to call delete method in AdminDAO
	 * @param int: admin id 
	 * @return Admin object if admin is found, else null
	 * @throws SQLException
	 */
	public Admin delete(int id) throws SQLException;
	/**
	 * Method to call insert method in AdminDAO 
	 * @param  Admin: object
	 * @return Admin object
	 * @throws SQLException
	 */

	public Admin insert(Admin admin) throws SQLException;
	/**
	 * Method to call update method in AdminDAO 
	 * @param int, Admin: admin id ,object
	 * @return Admin object if admin is found, else null
	 * @throws SQLException
	 */
	public Admin update(int id, Admin admin)throws SQLException;
	boolean approve(int id) throws SQLException;
	
	
}
