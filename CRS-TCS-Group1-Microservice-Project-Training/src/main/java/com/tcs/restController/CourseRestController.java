package com.tcs.restController;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import com.tcs.bean.Course;
import com.tcs.exception.CourseNotFoundException;
import com.tcs.service.CourseServiceInterface;
import com.tcs.service.StudentServiceInterface;

@RestController
@CrossOrigin
public class CourseRestController {
@Autowired
private CourseServiceInterface courses;
private static Logger logger = Logger.getLogger(CourseRestController.class);
private PreparedStatement statement = null;

	@GetMapping("/courses")
	public List getCourses() throws SQLException {
		return courses.courseList();
	}
	@RequestMapping(value="/courses/{id}",method=RequestMethod.GET)
	public ResponseEntity getCustomer(@PathVariable("id") int id) throws SQLException {

		Course courseId = courses.getcourseId(id);
		if (courseId == null) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(courseId, HttpStatus.OK);
	}

	@DeleteMapping("/delete/course/{id}")
	public ResponseEntity deleteCustomer(@PathVariable int id) throws SQLException, CourseNotFoundException {
		Course cou = courses.delete(id);
		if (null == cou) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(id, HttpStatus.OK);

	}
	@PostMapping(value = "/post/course")
	public ResponseEntity createCustomer(@RequestBody Course course) throws SQLException, CourseNotFoundException {

		courses.insert(course);

		return new ResponseEntity(course, HttpStatus.OK);
	}
	@PutMapping("/put/courses/{id}")
	public ResponseEntity updateCustomer(@PathVariable int id, @RequestBody Course course) throws SQLException {

		Course courseInfo = courses.update(id, course);

		if (null == courseInfo) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(course, HttpStatus.OK);
	}
	}
