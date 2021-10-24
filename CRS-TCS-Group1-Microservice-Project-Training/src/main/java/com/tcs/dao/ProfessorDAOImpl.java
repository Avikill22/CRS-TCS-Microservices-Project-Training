/**
 * 
 */
package com.tcs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.tcs.bean.Professor;
import com.tcs.constant.SQLQueriesConstants;
import com.tcs.util.DBUtils;

/**
 * @author ganes
 *
 */
@Repository
public class ProfessorDAOImpl implements ProfessorDAOInterface{
	private static Logger logger = Logger.getLogger(ProfessorDAOImpl.class);
	Connection con=DBUtils.getConnection();
	SQLQueriesConstants sql = new SQLQueriesConstants();

	@Override
	public List list() throws SQLException {
		// TODO Auto-generated method stub
		List<Professor> professor = new ArrayList<Professor>();
		try {
		PreparedStatement stmt = con.prepareStatement(sql.VIEW_LIST_PROFESSOR);
		logger.info("Database Connected......");
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			professor.add(new Professor(rs.getInt(1),rs.getString(2)));
		}
	}catch(SQLException e)
		{
		logger.error(e.getMessage());
	}
	finally
	{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return professor;
	}

	@Override
	public Professor get(int id) throws SQLException {
		// TODO Auto-generated method stub
		
		String s = sql.VIEW_SELECTED_PROFESSOR+ id;
		try {
		PreparedStatement stmt = con.prepareStatement(s);
		
		logger.info("Database Connected......");
		ResultSet rs= stmt.executeQuery();
		if (rs.next())
			return new Professor(rs.getInt("professorId"),rs.getString("professorName"));
		}catch(SQLException e)
		{
			logger.error(e.getMessage());
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Professor delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		String s = sql.VIEW_SELECTED_PROFESSOR+ id;
		try {
		PreparedStatement stmt = con.prepareStatement(s);
		ResultSet rs= stmt.executeQuery();
		stmt = con.prepareStatement(sql.DELETE_SELECTED_ID_PROFESSOR_DATA);
		stmt.setInt(1, id);
		stmt.execute();
		
		if (rs.next())
			return new Professor(rs.getInt("professorId"),rs.getString("professorName"));
		}catch(SQLException e)
		{
			logger.error(e.getMessage());
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Professor update(int id, Professor professor) throws SQLException {
		// TODO Auto-generated method stub
		try {
		PreparedStatement stmt=con.prepareStatement("update Professor set professorName=? where professorId=?");  
		stmt.setString(1,professor.getProfessorName());
		stmt.setInt(2, id );
		int i = stmt.executeUpdate();
		}catch(SQLException e)
		{
			logger.error(e.getMessage());
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return professor;
	}

	@Override
	public Professor insert(Professor professor) throws SQLException {
		// TODO Auto-generated method stub
		try {
		PreparedStatement stmt=con.prepareStatement("insert into Professor values(?,?)");
		stmt.setInt(1,professor.getProfessorId());
		stmt.setString(2,professor.getProfessorName());
		
		int i = stmt.executeUpdate();
		}catch(SQLException e)
		{
			logger.error(e.getMessage());
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return professor;
	}


}