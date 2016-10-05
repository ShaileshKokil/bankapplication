package com.capgemin.Repository;

import com.capgemini.pojo.Account;
import com.capgemini.pojo.Customer;
import com.capgemini.util.AccountAlreadyExistsException;
import com.capgemini.util.InsufficientBalanceException;

public interface BankRepostery {

	long displayBalnce(String accountNumber);

	boolean withdrawal(String accountNumber, long amount) throws InsufficientBalanceException;

	boolean despositeAmount(String accountNumber, long amount);

	void fundTransfer(String accountNumber, long amount);

	//boolean createAccount(Customer customer, Account account) throws AccountAlreadyExistsException;
	//boolean createCustomer(Customer customer);
	

}