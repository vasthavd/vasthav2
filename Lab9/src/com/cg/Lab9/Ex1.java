package com.cg.Lab9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		System.out.println("Enter Number of Elements:-");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0; i<n;i++)
		{
			System.out.println("Enter id of"+i+"Element");
			int id = scan.nextInt();
			System.out.println("Enter name of"+i+"Element");
			String data = scan.next();
			map.put(id, data);
		}
		
		List<String> l = getValues(map);
		
		for(String b : l) {
			System.out.println(b);
		}
		
		
		

	}

	private static List getValues(Map<Integer, String> map) {
		Collection<String> c = map.values();
		List<String> list = new ArrayList<String>(c);
		Collections.sort(list);
		return list;
	}

}
