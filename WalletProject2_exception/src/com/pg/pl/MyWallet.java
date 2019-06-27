package com.pg.pl;
import com.cg.bean.*;
import com.cg.exception.InsuffecientFundException;
import com.cg.service.*;

public class MyWallet {
   
	public static void main(String args[])
	{
		AccountService service = new AccountService();
		SavingAccount ob2 =new SavingAccount(105,95928058,"Dilpreet",55000.00);
		service.printStatment(ob2);
		double b1= 0.0;
		try
		{
		 b1=service.withdraw(ob2, 55000.00);
		System.out.println("After withdraw balance is "+b1);
		
		}
		catch(InsuffecientFundException e)
		{
			System.err.println(e.getMessage());
			System.err.println(e);
			
		}
		
		double tax=service.calculateTax(Gst.PCT_5, b1);
		System.out.println("GST is "+tax);
		
	}
	
}
