/**
 * 
 */
package com.tcs.service;

import java.sql.SQLException;
import java.util.List;

import com.tcs.bean.Payment;

/**
 * @author ashwi
 *
 */
public interface PaymentServiceInterface {
	public List PaymentList() throws SQLException;
	public Payment getId(int id) throws SQLException;
	public Payment insert(Payment student) throws SQLException;
}
