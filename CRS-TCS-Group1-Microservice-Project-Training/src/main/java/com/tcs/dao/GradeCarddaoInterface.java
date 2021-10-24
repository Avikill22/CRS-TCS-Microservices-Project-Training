/**
 * 
 */
package com.tcs.dao;

import java.sql.SQLException;
import com.tcs.bean.Grade;

/**
 * @author ganes
 *
 */
public interface GradeCarddaoInterface {
	/**
	 * Method to update
	 * @param gradeId
	 * @return list of updated grades
	 */
	public Grade updateGrade(int id, Grade grade) throws SQLException;
	/**
	 * Method to insert
	 * @param gradeId
	 * @return list of inserted
	 */
	public Grade addGrade(Grade grade) throws SQLException;
	

}
