package com.capgemin.testcases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemin.Repository.BankRepostery;
import com.capgemini.bank.service.BankService;
import com.capgemini.bank.service.BankServiceImpl;
import com.capgemini.util.AccountWapper;

public class BankServiceTest {

	BankService bankService;
	@Mock
	BankRepostery bank;

	AccountWapper wapper;
		@Before
		public void setUp() throws Exception {
			//bank=new BankReposteryImpl();
			bankService=new BankServiceImpl(bank);
			MockitoAnnotations.initMocks(this);
			
			
		}
		@Test(expected=java.lang.IllegalArgumentException.class)
		public void testDisplayAmountAccountNumbershouldnotbeZero() {
			bankService.displayBalance(wapper);
		}
	

}
