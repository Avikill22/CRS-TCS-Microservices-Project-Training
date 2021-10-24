/**
 * 
 */
package com.tcs.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.bean.Professor;
import com.tcs.dao.ProfessorDAOInterface;
import com.tcs.exception.ProfessorNotAdded;

/**
 * @author ganes
 *
 */
@Component
public class ProfessorServiceImpl implements ProfessorServiceInterface{
	@Autowired
	private ProfessorDAOInterface professordao;
	@Override
	public List list() throws SQLException {
		// TODO Auto-generated method stub
		try{
			return professordao.list();
		}
		catch(Exception ex)
		{
			throw ex;
		}
	}

	@Override
	public Professor get(int id) throws SQLException {
		// TODO Auto-generated method stub
		try{
				return professordao.get(id);
			}
			catch(Exception ex)
			{
				throw ex;
			}
	}

	@Override
	public Professor delete(int id) throws SQLException, ProfessorNotAdded {
		// TODO Auto-generated method stub
		try{
				return professordao.delete(id);
	   }
	   catch(Exception ex)
	   {
		   throw new ProfessorNotAdded(null);
	   }
		
	}

	@Override
	public Professor update(int id, Professor professor) throws SQLException, ProfessorNotAdded {
		// TODO Auto-generated method stub
			try{
					professordao.update(id, professor);
			   }
			   catch(Exception ex)
			   {
				   throw new ProfessorNotAdded(null);
			   }
			   return professor;
	}

	@Override
	public Professor insert(Professor professor) throws SQLException, ProfessorNotAdded {
			try{
					professordao.insert(professor);
			   }
			   catch(Exception ex)
			   {
				   throw new ProfessorNotAdded(null);
			   }
			   return professor;
		}

}