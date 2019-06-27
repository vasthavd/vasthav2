package excercise6;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeService {
	public static void Departments(List<Employee> l) {
		List<Employee> list=l.stream().filter(e->e.getDepartment()!=null && e.getDepartment().getDepartmentName().equals("IT")).collect(Collectors.toList());
		System.out.println("Department:IT");
		list.stream().forEach(e->System.out.println(e.getFirstName()+" "+e.getLastName()));
		System.out.println("Total Number of Employees: "+list.size());
		System.out.println();
		System.out.println("Department:Finance");
		List<Employee> list2=l.stream().filter(e->e.getDepartment()!=null && e.getDepartment().getDepartmentName().equals("Finance")).collect(Collectors.toList());
		list2.stream().forEach(e->System.out.println(e.getFirstName()+" "+e.getLastName()));
		System.out.println("Total Number of Employees: "+list2.size());
		System.out.println();
		System.out.println("Department:Finance");
		List<Employee> list3=l.stream().filter(e->e.getDepartment()!=null && e.getDepartment().getDepartmentName().equals("Non-Finance")).collect(Collectors.toList());
		list3.stream().forEach(e->System.out.println(e.getFirstName()+" "+e.getLastName()));
		System.out.println("Total Number of Employees: "+list3.size());
		System.out.println();
		
	}
public static void noDepartment(List<Employee> l) {
	System.out.println("Employee Having No Department");
	l.stream().filter(i->i.getDepartment()==null).forEach(i->System.out.println(i.getFirstName()+" "+i.getLastName()));
}
public static void Senior(List<Employee> l) {
	System.out.println("Senior Most Employee");
	l.stream().filter(e->e.getDesignation().equals("Senior Manager")).forEach(i->System.out.println(i.getFirstName()+" "+i.getLastName()));
}
interface findGreatest{
	public String greatest(List<Employee> a,List<Employee> b,List<Employee> c);
}
public static void highestEmployee(List<Employee> l) {
	List<Employee> listIT=l.stream().filter(e->e.getDepartment()!=null && e.getDepartment().getDepartmentName().equals("IT")).collect(Collectors.toList());
	System.out.println("Department:IT");
	List<Employee> listFinance=l.stream().filter(e->e.getDepartment()!=null && e.getDepartment().getDepartmentName().equals("Finance")).collect(Collectors.toList());
	List<Employee> listNonFinance=l.stream().filter(e->e.getDepartment()!=null && e.getDepartment().getDepartmentName().equals("Non-Finance")).collect(Collectors.toList());
	findGreatest fg=(a,b,c)->{
		if(a.size()>b.size() && a.size()>c.size())
			return a.get(0).getDepartment().getDepartmentName();
		else if(b.size()>a.size() && b.size()>c.size()){
			return b.get(0).getDepartment().getDepartmentName();
		}
		return c.get(0).getDepartment().getDepartmentName();
	};
	System.out.println("Department having maximum employees: "+fg.greatest(listIT,listFinance,listNonFinance));
	
}
public static void getIncresed(List<Employee> l) {
	l.stream().forEach(e->System.out.println("Name "+e.getFirstName()+" "+e.getLastName()+"\n"+"Salary:"+e.getSalary()+"Incresed Salary"+(0.15*e.getSalary()+e.getSalary())));
}
public static void main(String[] args) {
	List<Employee> l=EmployeeRepository.getList();
	EmployeeService.Departments(l);
	EmployeeService.noDepartment(l);
	EmployeeService.Senior(l);
	EmployeeService.highestEmployee(l);
	EmployeeService.getIncresed(l);

}
}
