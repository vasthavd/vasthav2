package cg;

import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args) {
		
		//generic collection
		//Set <String> col = new HashSet <String>();
		
		//Set <String> col = new LinkedHashSet <String>();//maintains insertion order//No duplicates
		//Set <String> col = new TreeSet <String>();
		//does accept null throw nullpointerException
	
		
		List <String> col = new ArrayList<String>();//multiples null....duplicates values..........
		
		col.add("Ram");
		col.add("Sham");
		col.add("Abdul");
	//	col.add(55);//new Integer//auto boxing
		col.add(null);
		col.add("Ganesh");
		col.add("Ram");
		System.out.println(col);
		
		System.out.println("===================================");
		
		for(String s:col)
		{
			System.out.println(s);
		}
		System.out.println("===================================");
		
		Iterator<String> it=col.iterator();
		while(it.hasNext())
		{
			String ss=it.next();
			System.out.println(ss);
		}
		
	}

}
