/**
 * 
 */
package com.tcs.util;

import java.io.*;
import java.sql.*;
import java.util.*;

import ch.qos.logback.core.db.dialect.DBUtil;
/**
 * @author Avinash Gupta
 *
 */
public class DBUtils {
	private static Connection connection = null;
	public static Connection getConnection() {
	
		if(connection!=null)
			return connection;
		else {
			try {
				Properties prop = new Properties();
				InputStream inputStream = DBUtil.class.getClassLoader().getResourceAsStream("./config.properties");
				prop.load(inputStream);
				String driver = prop.getProperty("driver");
				String url = prop.getProperty("url");
				String user = prop.getProperty("user");
				String password = prop.getProperty("password");
				
				Class.forName(driver);
				connection = DriverManager.getConnection(url,user,password);
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}catch(SQLException e) {
				e.printStackTrace();
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
			return connection;
		}
	}
}