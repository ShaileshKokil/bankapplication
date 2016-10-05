package com.capgemini.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import com.capgemini.util.Constant;

public class Account implements Serializable{
private static final long serialVersionUID = 8445451592553556444L;
private int accountId;
private String accountNumber;

public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
private Date accountOpenDate;
private int customerId;
private long amount;
public long getAmount() {
	return amount;
}
public void setAmount(long amount) {
	this.amount = amount;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
private String accountType=Constant.ACCOUNT_TYPE;


public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
public int getAccountId() {
	return accountId;
}
public void setAccountId(int accountId) {
	this.accountId = accountId;
}
public Date getAccountOpenDate() {
	return accountOpenDate;
}
public void setAccountOpenDate(Date accountOpenDate) {
	this.accountOpenDate = accountOpenDate;
}

}
