/**
 * 
 */
package com.tcs.restController;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.tcs.bean.Admin;

import com.tcs.dao.AdminDAOImpl;
import com.tcs.service.AdminServiceImpl;
import com.tcs.service.AdminServiceInterface;

/**
 * @author Avinash Gupta
 *
 */
@RestController
@CrossOrigin
public class AdminRestController {
	private static Logger logger = Logger.getLogger(AdminRestController.class);
	private PreparedStatement statement = null;
	@Autowired //CustomerDAO customerDAOOperation = new CustomerDAO();
	private AdminServiceInterface admins;
	
	@GetMapping("/admins")
	public List getAdmins() throws SQLException {
		return admins.adminList();
	}
	@RequestMapping(value="/admins/{id}",method=RequestMethod.GET)
	public ResponseEntity getadmin(@PathVariable("id") int id) throws SQLException {

		Admin adminId = admins.getId(id);
		if (adminId == null) {
			return new ResponseEntity("No Admin found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(adminId, HttpStatus.OK);
	}
	@RequestMapping(value="/admin/student/{id}",method=RequestMethod.GET)
	public ResponseEntity approveStudent(@PathVariable("id") int id) throws SQLException{
		boolean result = admins.approve(id);
		if(result) {
			return new ResponseEntity("Student Accpeted"+ id, HttpStatus.OK);
		}
		return new ResponseEntity("No Student found for ID " + id, HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("/delete/admin/{id}")
	public ResponseEntity deleteAdmin(@PathVariable int id) throws SQLException {
		Admin adm = admins.delete(id);
		if (null == adm) {
			return new ResponseEntity("No Admin found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(id, HttpStatus.OK);

	}
	@PostMapping(value = "/post/admin")
	public ResponseEntity insertAdmin(@RequestBody Admin admin) throws SQLException {

		admins.insert(admin);

		return new ResponseEntity(admin, HttpStatus.OK);
	}
	@PutMapping("/put/admins/{id}")
	public ResponseEntity updateCustomer(@PathVariable int id, @RequestBody Admin admin) throws SQLException {

		Admin updateInfoAdmin = admins.update(id, admin);

		if (null == updateInfoAdmin) {
			return new ResponseEntity("No Admin found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(admin, HttpStatus.OK);
	}
}
