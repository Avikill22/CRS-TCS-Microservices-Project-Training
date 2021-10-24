package com.tcs.restController;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.bean.Payment;
import com.tcs.service.PaymentServiceInterface;

/**
 * @author ashwi
 *
 */
@RestController
@CrossOrigin
public class PaymentRestController {
	@Autowired
	private PaymentServiceInterface payments;

	@RequestMapping(value = "/payments", method = RequestMethod.GET)
	public List getPayments() throws SQLException {
		return payments.PaymentList();
	}

	@RequestMapping(value = "/payments/{id}", method = RequestMethod.GET)
	public ResponseEntity getPayments(@PathVariable("id") int id) throws SQLException {

		Payment billId = payments.getId(id);
		if (billId == null) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(billId, HttpStatus.OK);
	}

	@RequestMapping(value = "/post/payment", method = RequestMethod.POST)
	public ResponseEntity createPayments(@RequestBody Payment payment) throws SQLException {
		try {
			payments.insert(payment);
		} catch (Exception e) {
			System.out.println(e);
		}

		return new ResponseEntity(payment, HttpStatus.OK);

	}
}
