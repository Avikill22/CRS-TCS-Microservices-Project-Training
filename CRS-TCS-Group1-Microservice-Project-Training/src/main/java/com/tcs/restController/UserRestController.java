/**
 * 
 */
package com.tcs.restController;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.bean.Student;
import com.tcs.bean.User;
import com.tcs.exception.UserNotFoundException;
import com.tcs.exception.UserNotRegisteredException;
import com.tcs.service.UserServiceInterface;

/**
 * @author Avinash Gupta
 *
 */
@RestController
@CrossOrigin
public class UserRestController {
	
	@Autowired
	private UserServiceInterface userService;
	
	@RequestMapping(value="/user",method= RequestMethod.GET)
	public List getUsers() throws SQLException {
		return userService.list();
	}
	@RequestMapping(value="/delete/user/{id}",method=RequestMethod.DELETE)
	public ResponseEntity deleteUser(@PathVariable int id) throws SQLException {
		User us = userService.deleteUser(id);
		if (null == us) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(id, HttpStatus.OK);

	}
	@RequestMapping(value="/user/insert" ,method=RequestMethod.POST)
	public ResponseEntity insert(User user) throws SQLException, UserNotRegisteredException {
		userService.insertUser(user);

		return new ResponseEntity(user, HttpStatus.OK);
	}
	@RequestMapping(value="/login" ,method=RequestMethod.POST)
	public ResponseEntity login(@QueryParam("name") String name,@QueryParam("password") String password) throws SQLException, UserNotFoundException {
		boolean loginStatus = userService.userlogin(name,password);
		if(loginStatus) {
			return new ResponseEntity("Login Successfully",HttpStatus.OK);
		}
		return new ResponseEntity("UserName and password Incorrect",HttpStatus.NOT_FOUND);
	}
}
