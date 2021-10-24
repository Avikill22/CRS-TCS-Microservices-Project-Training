/**
 * 
 */
package com.tcs.bean;

/**
 * @author ashwi
 *
 */
public class Notification {
private int notficationId;
private String notificationBody;
public Notification() {
	
}
public Notification(int notficationId, String notificationBody) {
	super();
	this.notficationId = notficationId;
	this.notificationBody = notificationBody;
}
/**
 * @return the notficationId
 */
public int getNotficationId() {
	return notficationId;
}
/**
 * @param notficationId the notficationId to set
 */
public void setNotficationId(int notficationId) {
	this.notficationId = notficationId;
}
/**
 * @return the notificationBody
 */
public String getNotificationBody() {
	return notificationBody;
}
/**
 * @param notificationBody the notificationBody to set
 */
public void setNotificationBody(String notificationBody) {
	this.notificationBody = notificationBody;
}

}
