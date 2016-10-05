package com.capgemini.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Customer implements Serializable{
	
	private static final long serialVersionUID = 1528581924806070195L;
	private int customerId;
	private String customerFirstName;
	private String customerLastName;
	private int customerPhoneNo;
	private Set<Account> account=new HashSet<Account>();
	public Set<Account> getAccount() {
		return account;
	}
	public void setAccount(Set<Account> account) {
		this.account = account;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
