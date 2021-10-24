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

import com.tcs.bean.Student;
import com.tcs.bean.User;
import com.tcs.constant.SQLQueriesConstants;
import com.tcs.exception.StudentNotRegisteredException;
import com.tcs.exception.UserNotFoundException;
import com.tcs.exception.UserNotRegisteredException;
import com.tcs.util.DBUtils;

/**
 * @author Avinash Gupta
 *
 */
@Repository
public class UserDAOImpl implements UserDAOInterface {
	private static Logger logger = Logger.getLogger(StudentDAOImpl.class);
	private PreparedStatement statement = null;
	Connection con = DBUtils.getConnection();
	SQLQueriesConstants sql = new SQLQueriesConstants();
	@Override
	public List list() throws SQLException{
		List<User> users = new ArrayList<User>();
		PreparedStatement stmt = con.prepareStatement("select * from users");
		System.out.println("Database Connected......");
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			users.add(new User(rs.getInt(1),rs.getString(2),rs.getString(3)));
		}
		return users;
	}
	

	@Override
	public User deleteUser(int id) throws SQLException {
		String s = sql.VIEW_SELECTED_USER + id;
		PreparedStatement stmt = con.prepareStatement(s);
		ResultSet rs = stmt.executeQuery();
		stmt = con.prepareStatement(sql.DELETE_SELECT_ID_DATA);
		stmt.setInt(1, id);
		stmt.execute();

		if (rs.next())
			return new User(rs.getInt(1),rs.getString(2), rs.getString(3));
		return null;
	}



	@Override
	public boolean userLogin(String name,String password) throws SQLException, UserNotFoundException {
		PreparedStatement stmt = con.prepareStatement("select password from users where userName = ?");
		stmt.setString(1,name);
		ResultSet rs = stmt.executeQuery();
		
		if(!rs.next()) {
			throw new UserNotFoundException(name);
		}else if(password.equals(rs.getString("password"))) {
			
			return true;
		}
		return false;	
	}


@Override
public User insertUser(User user) throws SQLException,UserNotRegisteredException {
	try {
		PreparedStatement stmt = con.prepareStatement(sql.INSERT_DATA_USER);
		stmt.setInt(1, user.getUserId());
		stmt.setString(2, user.getUserName());
		stmt.setString(3, user.getPassword());
		stmt.setInt(4, 0);
		stmt.executeUpdate();
	}catch(Exception e) {
		throw new UserNotRegisteredException(e.getMessage());
	}
	finally
	{
		try {
			con.close();
		} catch (SQLException e) {
			logger.info(e.getMessage()+"SQL error");
			e.printStackTrace();
		}
	}
	return user;
}


	
	

}
