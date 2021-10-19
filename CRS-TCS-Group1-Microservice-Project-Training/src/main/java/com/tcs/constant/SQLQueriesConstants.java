/**
 * 
 */
package com.tcs.constant;

/**
 * @author Avinash Gupta
 *
 */
public class SQLQueriesConstants {
	public static final String VIEW_LIST_STUDENTS = "select * from students";
	public static final String VIEW_SELECTED_STUDENT = "select * from students where studentId= ";
	public static final String DELETE_SELECTED_ID_STUDENT_DATA = "delete from student where studentId= ?";
}
