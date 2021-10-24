/**
 * 
 */
package com.tcs.restController;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.bean.Grade;
import com.tcs.dao.GradeCarddaoInterface;
import com.tcs.service.GradeCardServiceInterface;

/**
 * @author ganes
 *
 */
@RestController
public class GradeCardRestController {
	@Autowired
	private GradeCardServiceInterface gradeService;
	@PostMapping(value = "/post/grade")
	public ResponseEntity addGrade(@RequestBody Grade grade) throws SQLException {

		gradeService.addGrade(grade);

		return new ResponseEntity(grade, HttpStatus.OK);
	}
	@PutMapping("/put/grade/{id}")
	public ResponseEntity updateGrade(@PathVariable int id, @RequestBody Grade grade) throws SQLException {

		Grade updateInfograde = gradeService.updateGrade(id, grade);

		if (null == updateInfograde) {
			return new ResponseEntity("No Grades found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(grade, HttpStatus.OK);
	}
}
