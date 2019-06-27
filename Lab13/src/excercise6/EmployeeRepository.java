package excercise6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class EmployeeRepository {
public static List<Employee> getList() {
	Scanner s=new Scanner(System.in);

	List<Employee> l=new ArrayList<Employee>();
	Department d1=new Department(200,"IT",101);
	Department d2=new Department(201,"Finance",111);
	Department d3=new Department(202,"Non-Finance",110);
	Employee e1=new Employee(101,"Aayush","Gagre","aayushgagrai@gmail.com","9719832969",LocalDate.parse("2018-08-05"),"Senior Manager",5000.00,115,d1);
	Employee e2=new Employee(111,"Barry","Alan","barry@gmail.com","8745987652",LocalDate.parse("2018-08-10"),"Analyst",5000.00,112,d2);
	Employee e3=new Employee(110,"Cateleline","Snow","cateline@gmail.com","8745987653",LocalDate.parse("2018-01-15"),"Manager",5000.00,101,d3);
	Employee e4=new Employee(102,"Cisco","Remone","Hello","8745987654",LocalDate.parse("2017-03-20"),"Analyst",5000.00,101,d1);
	Employee e5=new Employee(103,"Harry","Wells","Hello","8745987655",LocalDate.parse("2017-04-06"),"Analyst",5000.00,110,d3);
	Employee e6=new Employee(104,"Alex","Parker","alex@gmail.com","8745987656",LocalDate.parse("2016-05-11"),"Analyst",5000.00,110,d3);
	Employee e7=new Employee(110,"Felicity","Smoke","Felicity@gmail.com","8745987657",LocalDate.parse("2017-06-16"),"Analyst",5000.00,110,null);
	l.add(e1);
	l.add(e2);
	l.add(e3);
	l.add(e4);
	l.add(e5);
	l.add(e6);
	l.add(e7);
	return l;
}
}
