/**
 * 
 */
package com.tcs.constant;

/**
 * @author Avinash Gupta
 *
 */
public class SQLQueriesConstants {
	//student table queries
	public static final String VIEW_LIST_STUDENTS = "select * from students";
	public static final String VIEW_SELECTED_STUDENT = "select * from students where studentId= ";
	public static final String DELETE_SELECTED_ID_STUDENT_DATA = "delete from students where studentId= ?";
	public static final String INSERT_DATA="insert into student values(?,?,?,?,?,?,(select userId from user where userId=?),(select courseId from course where courseId=?),?)";
	public static final String UPDATE_STUDENT="update students set aprrove = ? where studentId=?";
	
	//payment table queries
	public static final String VIEW_LIST_PAYMENTS = "select * from payment";
	public static final String VIEW_SELECTED_PAYMENT = "select * from payment where billId= ";
	public static final String MAKE_PAYMENT="insert into crs.payment values(?,?,?)";

	//notification table queries
	public static final String VIEW_SELECTED_NOTIFICATION = "select * from notification where notification= ";
	public static final String MAKE_NOTIFICATION="insert into crs.notification values(?,?)";
	
	//user table queries
	public static final String VIEW_ALL_USER_DATA = "select * from users";
	public static final String VIEW_SELECTED_USER = "select * from users where userId = ";
	public static final String INSERT_DATA_USER = "insert into users values(?,?,?,?)";
	public static final String UPDATE_PASSWORD_USER = "update users set password = ? where userId=?";
	public static final String DELETE_SELECT_ID_DATA = "Delete from users where userId = ? ";
	
	//admin table queries
	public static final String VIEW_LIST_ADMINS = "select * from admins";
	public static final String VIEW_SELECTED_ADMINS = "select * from admins where adminId= ";
	public static final String DELETE_SELECTED_ID_ADMINS_DATA = "delete from admins where adminId= ?";
	public static final String INSERT_DATA_ADMINS="insert into admins values(?,?,?,?,(select userId from users where userId=?))";
	
	//professor table queries
	public static final String VIEW_LIST_PROFESSOR = "select * from professor";
	public static final String VIEW_SELECTED_PROFESSOR = "select * from professor where professorId= ";
	public static final String DELETE_SELECTED_ID_PROFESSOR_DATA = "delete from professor where professorId= ?";
	
	//Course table queries
	public static final String VIEW_LIST_COURSE = "select * from course";
	public static final String VIEW_SELECTED_COURSE = "select * from course where courseId= ";
	public static final String DELETE_SELECTED_ID_COURSE = "delete from course where courseId= ?";
}
