package com.cg.eis.dao;
import java.util.HashMap;
import com.cg.eis.Exception.*;
import java.util.Map;

import com.cg.eis.bean.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
static Map<Integer,Employee> emmap = new HashMap<Integer,Employee>();
	

	@Override
	public boolean addEmployee(Employee e) {
		// TODO Auto-generated method stub
		emmap.put(e.getE_id(), e);
		return true;
	}

	@Override
	public boolean updateEmployee(Employee e) {
		
        emmap.put(e.getE_id(), e);
		return true;
	}

	@Override
	public boolean deleteEmployee(Employee e) {
		
		emmap.remove(e);
		return true;
	}

	@Override
	public Employee findEmployee(int e_id) {
		
		Employee e= emmap.get(e_id);
		return e;
	}

	@Override
	public Map<Integer, Employee> getAllEmployee() {
		
		return emmap;
	}

	
	

}
