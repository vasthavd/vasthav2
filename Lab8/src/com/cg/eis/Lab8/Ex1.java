package com.cg.eis.Lab8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nums="";
		System.out.println("Enter string of numbers");
		nums=br.readLine();
		int sum = 0;
	    for (int i = 0; i < nums.length(); i++) {
	      char a = nums.charAt(i);
	      if (Character.isDigit(a)) {
	        int b = Integer.parseInt(String.valueOf(a));
	        System.out.print(" "+b);
	        sum = sum + b;
	      }

	}
	    System.out.println(" ");
	    System.out.println("=========================");
		System.out.println("Sum :- "+sum);	
		System.out.println("==========================");
}
}