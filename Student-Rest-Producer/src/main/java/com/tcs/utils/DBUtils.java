/**
 * 
 */
package com.tcs.utils;
import java.io.*;
import java.sql.*;
import java.util.*;

import ch.qos.logback.core.db.dialect.DBUtil;

/**
 * @author ganes
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
				InputStream inputStream = DBUtils.class.getClassLoader().getResourceAsStream("application.properties");
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
