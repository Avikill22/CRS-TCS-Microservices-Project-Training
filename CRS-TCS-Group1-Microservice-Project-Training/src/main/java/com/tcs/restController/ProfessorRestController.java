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

import com.tcs.bean.Professor;
import com.tcs.bean.Student;
import com.tcs.exception.ProfessorNotAdded;
import com.tcs.exception.StudentNotRegisteredException;
import com.tcs.service.ProfessorServiceInterface;

/**
 * @author ganes
 *
 */
@RestController
public class ProfessorRestController {
	@Autowired
	private ProfessorServiceInterface professorService;
	@GetMapping("/professor")
	public List get() throws SQLException {
	

	
	return professorService.list();
}

@GetMapping("/professor/{id}")
public ResponseEntity get(@PathVariable("id") int id) throws SQLException {

	Professor professor = professorService.get(id);
	if (professor == null) {
		return new ResponseEntity("No professor found for ID " + id, HttpStatus.NOT_FOUND);
	}

	return new ResponseEntity(professor, HttpStatus.OK);
}
@PostMapping(value = "/post/professor")
public ResponseEntity insert(@RequestBody Professor professor) throws SQLException, ProfessorNotAdded {

	professorService.insert(professor);

	return new ResponseEntity(professor, HttpStatus.OK);
}
@PutMapping("/put/students/{id}")
public ResponseEntity update(@PathVariable int id, @RequestBody Professor professor) throws SQLException, ProfessorNotAdded {

	Professor updateProfessor = professorService.update(id,professor);

	if (null == updateProfessor) {
		return new ResponseEntity("No professor found for ID " + id, HttpStatus.NOT_FOUND);
	}

	return new ResponseEntity(professor, HttpStatus.OK);
}
@DeleteMapping("/delete/professor/{id}")
public ResponseEntity delete(@PathVariable int id) throws SQLException, ProfessorNotAdded{
	Professor prof = professorService.delete(id);
	if (null == prof) {
		return new ResponseEntity("No professor found for ID " + id, HttpStatus.NOT_FOUND);
	}

	return new ResponseEntity(id, HttpStatus.OK);

}
}