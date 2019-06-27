package com.cg.service;
import com.cg.bean.Account;
import com.cg.exception.InsuffecientFundException;
public interface Transaction {
	
	public double withdraw(Account ob, double amount) throws InsuffecientFundException;
	public double Deposit(Account ob, double amount); 
	public double Transfer(Account from, Account to); 
	
	public default void printStatment(Account ob)
	{
		System.out.println("=====================================");
		System.out.println("Statement for Account No."+ob.getAid());
		System.out.println("AccountHolder Name "+ob.getAccountholder());
		System.out.println("Balance is "+ob.getBalance());
		System.out.println("=====================================");
	}

}
