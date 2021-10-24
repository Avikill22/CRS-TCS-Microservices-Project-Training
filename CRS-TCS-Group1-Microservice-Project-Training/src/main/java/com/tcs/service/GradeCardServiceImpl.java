/**
 * 
 */
package com.tcs.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.bean.Grade;
import com.tcs.dao.GradeCarddaoInterface;

/**
 * @author ganes
 *
 */
@Component
public class GradeCardServiceImpl implements GradeCardServiceInterface{
	@Autowired
	private GradeCarddaoInterface gradess;

	@Override
	public Grade updateGrade(int id, Grade grade) throws SQLException {
		// TODO Auto-generated method stub
		try{
			return gradess.updateGrade(id, grade);
		}
		catch(Exception ex)
		{
			throw ex;
		}
	}

	@Override
	public Grade addGrade(Grade grade) throws SQLException {
		// TODO Auto-generated method stub
		try{
			return gradess.addGrade(grade);
		}
		catch(Exception ex)
		{
			throw ex;
		}
		
	}
	
}
