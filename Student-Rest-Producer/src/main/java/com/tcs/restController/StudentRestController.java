
package com.tcs.restController;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.bean.Student;
import com.tcs.service.StudentServiceInterface;

/**
 * @author ashwi
 *
 */
@RestController
@CrossOrigin
public class StudentRestController {

	@Autowired
	private StudentServiceInterface students;

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public List getStudents() throws SQLException {
		return students.studentList();
	}

	@RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
	public ResponseEntity getStudent(@PathVariable("id") int id) throws SQLException {

		Student studentId = students.getId(id);
		if (studentId == null) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(studentId, HttpStatus.OK);
	}

	

	@RequestMapping(value = "/post/student", method = RequestMethod.POST)
	public ResponseEntity RegisterStudent(@RequestBody Student student) throws SQLException {
		try {
			students.insert(student);
		} catch (Exception e) {
			System.out.println(e);
		}

		return new ResponseEntity(student, HttpStatus.OK);
	}

//@PutMapping("/put/students/{id}")
	@RequestMapping(value = "/update/student/{id}", method = RequestMethod.PUT)
	public ResponseEntity updateStudent(@PathVariable int id, @RequestBody Student student) throws SQLException {

		Student updateInfoStudent = students.update(id, student);

		if (null == updateInfoStudent) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(student, HttpStatus.OK);
	}
}