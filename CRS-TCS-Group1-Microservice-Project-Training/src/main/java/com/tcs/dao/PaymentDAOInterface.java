package com.tcs.dao;

import java.sql.SQLException;
import java.util.List;

import com.tcs.bean.Payment;

/**
 * @author ashwi
 *
 */
public interface PaymentDAOInterface {
	public List list() throws SQLException;
	public Payment getId(int id) throws SQLException; 
	public Payment insert(Payment payment) throws SQLException;
	/**
	 * @return the students
	 * @throws SQLException 
	 */
}
