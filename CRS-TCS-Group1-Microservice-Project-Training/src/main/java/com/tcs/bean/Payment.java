package com.tcs.bean;

/**
 * @author ashwi
 *
 */
public class Payment {
private int billId;
private double amount;
private String timestamp;
public Payment() {
	
}
public Payment(int billId, double amount, String timestamp) {
	super();
	this.billId = billId;
	this.amount = amount;
	this.timestamp = timestamp;
}
/**
 * @return the billId
 */
public int getBillId() {
	return billId;
}
/**
 * @param billId the billId to set
 */
public void setBillId(int billId) {
	this.billId = billId;
}
/**
 * @return the amount
 */
public double getAmount() {
	return amount;
}
/**
 * @param amount the amount to set
 */
public void setAmount(double amount) {
	this.amount = amount;
}
/**
 * @return the timestamp
 */
public String getTimestamp() {
	return timestamp;
}
/**
 * @param timestamp the timestamp to set
 */
public void setTimestamp(String timestamp) {
	this.timestamp = timestamp;
}


}