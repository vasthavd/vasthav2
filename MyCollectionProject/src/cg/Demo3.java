package cg;

import java.util.*;
import java.util.TreeMap;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Double> m = new HashMap <String,Double>();
		//Map<String,Double> m = new TreeMap <String,Double>();
		m.put("Ram",5000.00);
		m.put("Sham",7000.00);
		m.put("Abdul",9000.00);
		m.put("Ganesh",4000.00);
		
		Set<String> keysSet =m.keySet();
		System.out.println(keysSet);
		
		for(String k : keysSet)
		{
			Double val =m.get(k);
			System.out.println(k+" has balance of rs. "+val);
		}
		
		System.out.println("==========================================================");
		Double bal = m.get("Sham");
		System.out.println("Before "+bal);
		bal=bal-3000.00;// auto unboxing
		m.put("Sham",bal );//auto boxing
		System.out.println("After "+bal);
		
		
		Collection<Double> vals = m.values();
		List<Double> valist=new ArrayList(vals);
		Collections.sort(valist);
		for(double d:valist)
		{
			System.out.println(d);
		}
	}

}
