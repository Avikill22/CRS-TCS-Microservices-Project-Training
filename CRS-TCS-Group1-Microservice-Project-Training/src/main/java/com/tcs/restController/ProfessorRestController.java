/**
 * 
 */
package com.tcs.restController;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.bean.Professor;
import com.tcs.bean.Student;

/**
 * @author Avinash Gupta
 *
 */

@RestController
public class ProfessorRestController {
	@RequestMapping(produces=MediaType.APPLICATION_JSON,
			method= RequestMethod.GET 
			,value= "/professordetails")
	@ResponseBody
	public Professor details(){
		//restcontroller->Service->dao
		Professor c1=new Professor();
		c1.setEmpId ("101");
		c1.setEmpDepartment("amit");
		c1.setCourseAllocation("delhi");
			
		
		return c1;
		   
	}
}
