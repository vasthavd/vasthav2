package com.cg.Lab9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex2 {
	
	
	
	
	public static void countCharacters(char b[])
	{
		HashMap<Character, Integer> charCountMap 
	    = new HashMap<Character, Integer>(); 
		// checking each char of strArray 
		for (char c : b) { 
			if (charCountMap.containsKey(c)) { 

				// If char is present in charCountMap, 
				// incrementing it's count by 1 
				charCountMap.put(c, charCountMap.get(c) + 1); 
			} 
			else { 

				// If char is not present in charCountMap, 
				// putting this char to charCountMap with 1 as it's value 
				charCountMap.put(c, 1); 
			} 
		} 

		// Printing the charCountMap 
		for (Map.Entry entry : charCountMap.entrySet()) { 
			System.out.println(entry.getKey() + " " + entry.getValue()); 
		} 
	}

	
	
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number of characters:-");
			int a = scan.nextInt();
			char ch[] = new char[a];
			System.out.println("The no of characters are:-");
			for(int k = 0; k<a ; k++)
			{
				ch[k] = scan.next().charAt(0);
			}
			countCharacters(ch);
			scan.close();
			
}


}

