package com.tcs.dao;

import java.sql.SQLException;

import com.tcs.bean.Notification;


/**
 * @author ashwi
 *
 */
public interface NotificationDAOInterface {
	public Notification getId(int id) throws SQLException; 
	public Notification insert(Notification notification) throws SQLException;
}
