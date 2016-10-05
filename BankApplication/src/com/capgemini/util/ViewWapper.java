package com.capgemini.util;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ViewWapper {
private String customerFirstName;
private String customerLastName;
private int customerPhoneNo;

private Set<AccountWapper> accountWapper=new HashSet<AccountWapper>();

public Set<AccountWapper> getAccountWapper() {
	return accountWapper;
}
public void setAccountWapper(Set<AccountWapper> accountWapper) {
	this.accountWapper = accountWapper;
}
public String getCustomerFirstName() {
	return customerFirstName;
}
public void setCustomerFirstName(String customerFirstName) {
	this.customerFirstName = customerFirstName;
}
public String getCustomerLastName() {
	return customerLastName;
}
public void setCustomerLastName(String customerLastName) {
	this.customerLastName = customerLastName;
}
public int getCustomerPhoneNo() {
	return customerPhoneNo;
}
public void setCustomerPhoneNo(int customerPhoneNo) {
	this.customerPhoneNo = customerPhoneNo;
}


}
