package com.capgemin.testcases;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemin.Repository.BankRepostery;

import com.capgemini.pojo.Account;
import com.capgemini.pojo.Customer;
import com.capgemini.util.AccountAlreadyExistsException;
import com.capgemini.util.AccountWapper;
import com.capgemini.util.InsufficientBalanceException;
import com.capgemini.util.ViewWapper;

public class BankReposteryTestCase {

@Mock
BankRepostery bank;
	@Before
	public void setUp() throws Exception {
		//bank=new BankReposteryImpl();
		MockitoAnnotations.initMocks(this);
	}

	@Test(expected=java.lang.IllegalArgumentException.class)
	public void testDisplayAmountAccountNumbershouldnotbeZero() {
		String accountNumber="10";
		bank.displayBalnce(accountNumber);
	}
	@Test(expected=java.lang.IllegalArgumentException.class)
	public void testWithdrawalAmmountshouldnotbegreaterthantotalbalance() {
		String accountNumber="1233";
		long amount=1233;
		try {
			bank.withdrawal(accountNumber,amount);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
//	@Test(expected=com.capgemini.util.AccountAlreadyExistsException.class)
//	public void testCreateAccountAlreadyExists() throws AccountAlreadyExistsException {
//		Customer customer=new Customer();
//		customer.setCustomerFirstName("Shailesh");
//		customer.setCustomerLastName("Kokil");
//		customer.setCustomerPhoneNo(1234);
//		bank.createCustomer(customer);
//	    Account account =new Account();
//	    account.setAccountOpenDate(new Date());
//	    account.setAccountNumber("022022222227");
//	    account.setAmount(1234);
//	    bank.createAccount(customer, account);
//	    Account account1 =new Account();
//	    account1.setAccountOpenDate(new Date());
//	    account1.setAccountNumber("022022222227");
//	    account1.setAmount(1234);
//	    bank.createAccount(customer, account1);
//	   
//	   
//	   
//	}
}
