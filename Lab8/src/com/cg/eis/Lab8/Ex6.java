package com.cg.eis.Lab8;

import java.time.*;
import java.util.*;

public class Ex6 {  
   public static void main(String[] args)
   
    {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Day in numbers");
	   int dd=sc.nextInt();
	   System.out.println("Enter Month in numbers");
	   int mon=sc.nextInt();
	   System.out.println("Enter year in numbers");
	   int yyyy=sc.nextInt();
        
	   
	    LocalDate pdate = LocalDate.of(yyyy, mon, dd);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
  }
}
