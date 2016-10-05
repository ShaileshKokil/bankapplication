package com.capgemini.bank.service;

import com.capgemini.pojo.Account;
import com.capgemini.pojo.Customer;
import com.capgemini.util.AccountAlreadyExistsException;
import com.capgemini.util.AccountWapper;
import com.capgemini.util.InsufficientBalanceException;
import com.capgemini.util.ViewWapper;

public interface BankService {

	long displayBalance(AccountWapper wapper);

	boolean withdrawal(AccountWapper wapper) throws InsufficientBalanceException;

	boolean despositeAmount(AccountWapper wapper);

	void fundTransfer(AccountWapper wapper);

	boolean createAccount(ViewWapper wapper) throws AccountAlreadyExistsException;

	

}