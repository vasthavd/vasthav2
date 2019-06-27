package com.cg.eis.Lab8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Ex7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter User Name ends with '_job' ");
		String input="";
		 while(true)
		  {
			  input=br.readLine();
			  boolean ch1=Validator.validatedata(input, Validator.e_namepattern);
			  if(ch1==true)
			  {
				  System.out.println("True: Successfully Recorded");
				  break;
				  
				  
		       }
			  else
				  System.out.println("Re Enter User Name"); 
			  
		  
		  }
		 
		
	}

}
