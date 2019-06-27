package com.cg.eis.dao;
import com.cg.eis.Exception.InvalidInputException;
import com.cg.eis.bean.*;
import java.util.Map;

public interface EmployeeDAO {
	
	
	public boolean addEmployee(Employee e);
	public boolean updateEmployee(Employee e);
	public boolean deleteEmployee(Employee e);
	public Employee findEmployee(int e_id);
	public Map <Integer,Employee> getAllEmployee();



}
