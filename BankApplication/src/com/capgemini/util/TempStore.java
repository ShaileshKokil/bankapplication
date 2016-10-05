package com.capgemini.util;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.pojo.Account;
import com.capgemini.pojo.Customer;

public class TempStore {
	private TempStore(){
		
	}
	private static List<Account> accountList=new ArrayList<Account>();
	private static List<Customer> customerList=new ArrayList<Customer>();
	public static List<Customer> getCustomerList() {
		return customerList;
	}
	public static void setCustomerList(List<Customer> customerList) {
		TempStore.customerList = customerList;
	}
	private static int accountId=1;
	private static int customerId=1;
	public static List<Account> getAccountList() {
		return accountList;
	}
	public static void setAccountList(List<Account> accountList) {
		TempStore.accountList = accountList;
	}
	public static int getAccountId() {
		return accountId;
	}
	public static void setAccountId(int accountId) {
		TempStore.accountId = accountId;
	}
	public static int getCustomerId() {
		return customerId;
	}
	public static void setCustomerId(int customerId) {
		TempStore.customerId = customerId;
	}
	
}
