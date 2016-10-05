package com.capgemini.main;

import java.util.Date;


import com.capgemini.bank.service.BankService;
import com.capgemini.bank.service.BankServiceImpl;
import com.capgemini.pojo.Account;
import com.capgemini.pojo.Customer;
import com.capgemini.util.AccountAlreadyExistsException;
import com.capgemini.util.AccountWapper;
import com.capgemini.util.ViewWapper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*BankService bankService=new BankServiceImpl(new BankReposteryImpl());
     
    
    ViewWapper wapper=new ViewWapper();
    wapper.setCustomerFirstName("Shailesh");
    wapper.setCustomerLastName("Kokil");
    wapper.setCustomerPhoneNo(1234);
    AccountWapper accountWapper =new AccountWapper();
    accountWapper.setAccountOpenDate(new Date());
    accountWapper.setAccountNumber("022022222227");
    accountWapper.setAmount(1234);
    wapper.getAccountWapper().add(accountWapper);
   
    AccountWapper accountWapper1 =new AccountWapper();
    accountWapper1.setAccountOpenDate(new Date());
    accountWapper1.setAccountNumber("022022222227");
    accountWapper1.setAmount(1234);
    wapper.getAccountWapper().add(accountWapper1);
    try {
		bankService.createAccount(wapper);
	} catch (AccountAlreadyExistsException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
     
     
     accountWapper1 =new AccountWapper();
     accountWapper1.setAccountNumber("022022222223");
     accountWapper1.setAmount(100);
     bankService.despositeAmount(accountWapper1);
     System.out.println(bankService.displayBalance(accountWapper1));
      */
   
    
    String s2="Shailesh";
    String s=new String("Shailesh");
    System.out.println("Before=="+ (s2==s));
     s=s.intern();
     System.out.println("Before=="+ (s2==s));
    
	}

}
