package com.cg.service;

import java.util.Map;

import com.cg.bean.Account;
import com.cg.exception.InsuffecientFundException;

public interface AccountOperation {
	public boolean addAccount(Account ob);
	public boolean deleteAccount(Account ob);
	public boolean updateAccount(Account ob);
	public Account findAccount(Long mobileno);
	public Map<Long,Account> getAllAccounts();
	public double TransferMoney(Account from, Account to,double amount) throws InsuffecientFundException; 
}
