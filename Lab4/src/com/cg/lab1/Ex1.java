package com.cg.lab1;

import java.util.Scanner;

public class Ex1 {

	static int calculateSum(int n)
	{
		int sum=0;
		int r=0;
		
		
		
		while(n>0)    
		{    
		r=n%10;    
		sum=sum+(r*r*r);    
		n=n/10;    
		}   
		return sum;
	}

	public static void main (String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number :- ");
		int n=sc.nextInt();
		int sum=calculateSum(n);
		System.out.println("sum of the cubes of the digits of an "+n+" number "+sum);
		
		
	}

}
