package com.cg.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.cg.bean.Account;
import com.cg.exception.InsuffecientFundException;
import com.cg.service.AccountService;
import com.sun.java_cup.internal.runtime.Scanner;

class CollectionTest {
	@Disabled
	@Test
     public void withdrawTest() throws InsuffecientFundException 
		{
			Account a=new Account(101,1010101010,"Ram",50000.00);
		
			AccountService service=new AccountService();
			assertEquals(49000.00,service.withdraw(a,1000.00));
			//assertThrows(InsufficientFunfException.class, ()->service.withdraw(a, 44500.00));
		}
		@Test
		public void depositTest() throws InsuffecientFundException 
		{
			Account a=new Account(101,1010101010,"Ram",50000.00);
			
			AccountService service=new AccountService();
		
			assertEquals(51000,service.Deposit(a, 1000.00));
		}
	}


