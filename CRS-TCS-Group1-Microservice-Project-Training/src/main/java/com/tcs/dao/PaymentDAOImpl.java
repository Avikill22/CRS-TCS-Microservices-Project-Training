
package com.tcs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tcs.bean.Payment;
import com.tcs.constant.SQLQueriesConstants;
import com.tcs.util.DBUtils;

/**
 * @author ashwi
 *
 */
@Repository
public class PaymentDAOImpl implements PaymentDAOInterface{
	Connection con = DBUtils.getConnection();
	SQLQueriesConstants sql = new SQLQueriesConstants();
	@Override
	public List list() throws SQLException {
		List<Payment> payments = new ArrayList<Payment>();
		PreparedStatement stmt = con.prepareStatement(sql.VIEW_LIST_PAYMENTS);
		System.out.println("Database Connected......");
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			payments.add(new Payment(rs.getInt(1),rs.getDouble(2),rs.getString(3)));
		}
		return payments;
	}
	@Override
	public Payment getId(int id) throws SQLException {
		String s = sql.VIEW_SELECTED_PAYMENT+ id;
		PreparedStatement stmt = con.prepareStatement(s);
		
		System.out.println("Database Connected......");
		ResultSet rs= stmt.executeQuery();
		if (rs.next())
			return new Payment(rs.getInt("billId"),rs.getDouble("amount"), rs.getString("timestamp"));
		return null;
	}
	
	@Override
	public Payment insert(Payment payment) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement stmt=con.prepareStatement(sql.MAKE_PAYMENT);
		
		stmt.setInt(1,payment.getBillId());
		stmt.setDouble(2,payment.getAmount());
		stmt.setString(3,payment.getTimestamp());
		
		int i = stmt.executeUpdate();
		
		return payment;	}
	
}
