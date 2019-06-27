package com.cg.eis.service;

public interface Validator {
	//for id it should be 4 numeric digits starting with non-zero
	String e_idpattern="[1-9][0-9][0-9][0-9]";
	//all names D'souza, Mr. Singh, ram, Raman Gupta -------
	String e_namepattern ="[a-zA-Z][a-z]*+[']*[.]*[ ]*+[a-zA-Z]*+[ ]*+[a-zA-Z]*";
	//salary any double
	String e_salary="[0-9]*+[.]*+[0-9]*";
	
	public static boolean validatedata(String data, String pattern)
	{
		return data.matches(pattern);
	}

}
