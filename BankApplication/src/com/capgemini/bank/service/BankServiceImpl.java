package com.capgemini.bank.service;

import java.util.Date;
import java.util.Set;

import com.capgemin.Repository.BankRepostery;
import com.capgemini.pojo.Account;
import com.capgemini.pojo.Customer;
import com.capgemini.util.AccountAlreadyExistsException;
import com.capgemini.util.AccountWapper;
import com.capgemini.util.InsufficientBalanceException;
import com.capgemini.util.ViewWapper;

public class BankServiceImpl implements BankService  {


BankRepostery bank=null;
public BankServiceImpl(BankRepostery bank){
	this.bank=bank;
}
/* (non-Javadoc)
 * @see com.capgemini.bank.service.BankService#displayBalnce(int)
 */
@Override
public long displayBalance(AccountWapper wapper){
	if((wapper.getAccountNumber()==null || wapper.getAccountNumber().length()==0) ){
		throw new IllegalArgumentException();
	}
	return bank.displayBalnce(wapper.getAccountNumber());
}


/* (non-Javadoc)
 * @see com.capgemini.bank.service.BankService#withdrawal(int, long)
 */
@Override
public boolean withdrawal(AccountWapper wapper){
	try {
		return bank.withdrawal(wapper.getAccountNumber(),wapper.getAmount());
	} catch (InsufficientBalanceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
}


/* (non-Javadoc)
 * @see com.capgemini.bank.service.BankService#createAccount(int)
 */
@Override
public boolean createAccount(ViewWapper wapper) throws AccountAlreadyExistsException{
	boolean accountCreated=true;
	/* Customer customer=new Customer();
     customer.setCustomerFirstName(wapper.getCustomerFirstName());
     customer.setCustomerLastName(wapper.getCustomerLastName());
     customer.setCustomerPhoneNo(wapper.getCustomerPhoneNo());
     accountCreated=bank.createCustomer(customer);
     Set<AccountWapper> accountset=wapper.getAccountWapper();
     for(AccountWapper accountWapper:accountset){
    	 Account account=new Account();
         account.setAccountOpenDate(accountWapper.getAccountOpenDate());
         account.setAccountNumber(accountWapper.getAccountNumber());
         account.setAmount(accountWapper.getAmount());
         accountCreated=bank.createAccount(customer, account);
     }
     */
    return accountCreated;
	
}


/* (non-Javadoc)
 * @see com.capgemini.bank.service.BankService#despositeAmount(int, int)
 */
@Override
public boolean despositeAmount(AccountWapper wapper){
	return bank.despositeAmount(wapper.getAccountNumber(),wapper.getAmount());
}

/* (non-Javadoc)
 * @see com.capgemini.bank.service.BankService#fundTransfer(int, int)
 */
@Override
public void fundTransfer(AccountWapper wapper){
	bank.fundTransfer(wapper.getAccountNumber(),wapper.getAmount());
}
}

