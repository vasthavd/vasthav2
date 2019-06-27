package cg;
import java.util.*;
import com.cg.bean.*;

public class Demo4 {
	
	public static void main(String args [])
	{
	Map <Integer,Account> accmap=new TreeMap<Integer,Account>();
	Account ob1=new Account(101,98797098,"Ram",25000.00);
	accmap.put(ob1.getMobile(),ob1);
	Account ob2=new Account(102,98797097,"Sham",55000.00);
	accmap.put(ob2.getMobile(),ob2);
		
	Account ob3=new Account(105,98797096,"Abdul",25000.00);
	accmap.put(ob3.getMobile(),ob3);
	
	System.out.println(accmap);
	System.out.println(accmap.keySet());
	
	System.out.println("=========================================================");
	Collection<Account> vc = accmap.values();
	List<Account> acclist=new ArrayList<Account>(vc);
	Collections.sort(acclist);
	for(Account o : acclist)
	{
		System.out.println(o);
	}
	System.out.println("================================================sort by name");
	
	Comparator nc = new NameComparator();
	Collections.sort(acclist,nc);
	for(Account o:acclist)
	{
		System.out.println(o);
	}
	
System.out.println("================================================sort by balance");
	
	Comparator bc = new BalanceComparator();
	Collections.sort(acclist,bc);
	for(Account o:acclist)
	{
		System.out.println(o);
	}
		
	}

	
	
	
}
