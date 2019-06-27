package com.cg.eis.service;

import java.util.Map;

import com.cg.eis.Exception.InvalidInputException;
import com.cg.eis.bean.Employee;
import com.cg.eis.dao.*;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO dao = new EmployeeDAOImpl();
	@Override
	public boolean addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return dao.addEmployee(e);
	}

	@Override
	public boolean updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(e);
	}

	@Override
	public boolean deleteEmployee(Employee e) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(e);
	}

	@Override
	public Employee findEmployee(int e_id) {
		// TODO Auto-generated method stub
		return dao.findEmployee(e_id);
	}

	@Override
	public Map<Integer, Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllEmployee();
	}

	@Override
public String getScheme( double salary, String e_designation) throws InvalidInputException {
		
		if(((salary>=5000)&&(salary<20000))&&(e_designation.equalsIgnoreCase("System Associate")))
				{
			     return "Scheme C";
				}
		else if(((salary>=20000)&&(salary<40000))&&(e_designation.equalsIgnoreCase("Programmer")))
		{
	     return "Scheme B";
		}
		
		else if((salary>=40000)&&(e_designation.equalsIgnoreCase("Manager")))
		{
	     return "Scheme A";
		}
		
		else if((salary<5000)&&(e_designation.equalsIgnoreCase("Clerk")))
		{
	     return "No Scheme";
		}
		
		else 
		{
			throw new InvalidInputException("Salary Range is not matching with Designation of an Employee...Enter Correct Details");

	     
		}
		
	}

	
	
}
