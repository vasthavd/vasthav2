package com.cg.eis.Lab8;

public interface Validator {
	
	
	String e_namepattern ="[a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z][a-z]*+[_]+[j]+[o]+[b]";
	//salary any double
	String e_salary="[0-9]*+[.]*+[0-9]*";
	
	public static boolean validatedata(String data, String pattern)
	{
		return data.matches(pattern);
	}

}
