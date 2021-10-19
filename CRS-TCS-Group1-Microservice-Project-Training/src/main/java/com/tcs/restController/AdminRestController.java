/**
 * 
 */
package com.tcs.restController;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.bean.Admin;


/**
 * @author Avinash Gupta
 *
 */
@RestController
public class AdminRestController {
	@RequestMapping(produces=MediaType.APPLICATION_JSON,
			method= RequestMethod.GET 
			,value= "/admindetails")
	@ResponseBody
	public Admin details(){
		//restcontroller->Service->dao
		Admin c1=new Admin();
		c1.setEmpId("1234@st");
		return c1;
}
}
