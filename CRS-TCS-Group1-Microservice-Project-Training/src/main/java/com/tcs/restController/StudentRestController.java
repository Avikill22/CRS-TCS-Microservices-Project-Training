/**
 * 
 */
package com.tcs.restController;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.core.MediaType;

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

import com.tcs.bean.Student;

import com.tcs.dao.StudentDAOImpl;
import com.tcs.service.StudentServiceImpl;
import com.tcs.service.StudentServiceInterface;

/**
 * @author Avinash Gupta
 *
 */
@RestController
@CrossOrigin
public class StudentRestController {
	@Autowired //CustomerDAO customerDAOOperation = new CustomerDAO();
	private StudentServiceInterface students;
	
	@GetMapping("/students")
	public List getStudents() throws SQLException {
		return students.studentList();
	}
	@RequestMapping(value="/students/{id}",method=RequestMethod.GET)
	public ResponseEntity getCustomer(@PathVariable("id") int id) throws SQLException {

		Student customer = students.getId(id);
		if (customer == null) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(customer, HttpStatus.OK);
	}

//	@DeleteMapping("/delete/customers/{id}")
////	public ResponseEntity deleteCustomer(@PathVariable int id) throws SQLException {
////
////		if (null == StudentServiceImpl.delete(id)) {
////			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
////		}
////
////		return new ResponseEntity(id, HttpStatus.OK);
////
////	}
	@PostMapping(value = "/post/student")
	public ResponseEntity createCustomer(@RequestBody Student student) throws SQLException {

		students.insert(student);

		return new ResponseEntity(student, HttpStatus.OK);
	}
	@PutMapping("/put/students/{id}")
	public ResponseEntity updateCustomer(@PathVariable int id, @RequestBody Student student) throws SQLException {

		Student updateInfoStudent = students.update(id, student);

		if (null == updateInfoStudent) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(student, HttpStatus.OK);
	}
}
