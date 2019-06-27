package com.cg.service;
import com.cg.bean.Account;
import com.cg.exception.InsuffecientFundException;
public class AccountService implements Gst,Transaction {

	@Override
	public double withdraw(Account ob, double amount) throws InsuffecientFundException {
		// TODO Auto-generated method stub
		
		double new_balance=ob.getBalance()-amount;
		if(new_balance<1000.0)
		{
			new_balance=ob.getBalance();
			//System.out.println("Insufficient Balance");
			//throw new RuntimeException("Insufficient fund. Can not process withdrawal");
			throw new InsuffecientFundException("Insufficient fund. Can not process withdrawal",new_balance);
		}
		ob.setBalance(new_balance);
		
		return new_balance;
	}

	@Override
	public double calculateTax (double PCT, double amount) {
		// TODO Auto-generated method stub
		return amount*Gst.PCT_5;
	}

	@Override
	public double Deposit(Account ob, double amount) {
		
		return 0;
	}

	@Override
	public double Transfer(Account from, Account to) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
