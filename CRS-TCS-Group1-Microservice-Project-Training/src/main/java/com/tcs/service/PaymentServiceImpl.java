package com.tcs.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.tcs.bean.Payment;
import com.tcs.dao.PaymentDAOInterface;

/**
 * @author ashwi
 *
 */
@Component
@Service
public class PaymentServiceImpl implements PaymentServiceInterface{
@Autowired
private PaymentDAOInterface payments;
	@Override
	public List PaymentList() throws SQLException {
		// TODO Auto-generated method stub
		return payments.list();
	}

	@Override
	public Payment getId(int id) throws SQLException {
		// TODO Auto-generated method stub
		return payments.getId(id);
	}

	@Override
	public Payment insert(Payment student) throws SQLException {
		// TODO Auto-generated method stub
		return payments.insert(student);
	}

}
