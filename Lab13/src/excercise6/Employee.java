package excercise6;

import java.time.LocalDate;

public class Employee {
private int employeeId;
private String firstName;
private String lastName;
private String email;
private String phoneNumber;
private LocalDate hireDate;
private String designation;
private double salary;
private int managerId;
private Department department;
public Employee(int eid,String firstName,String lastName,String email,
String phoneNumber,
LocalDate hireDate,
String designation,
double salary,
int managerId,
Department department) {
	this.department=department;
	this.designation=designation;
	this.email=email;
	this.employeeId=employeeId;
	this.firstName=firstName;
	this.hireDate=hireDate;
	this.lastName=lastName;
	this.managerId=managerId;
	this.phoneNumber=phoneNumber;
	this.hireDate=hireDate;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public LocalDate getHireDate() {
	return hireDate;
}
public void setHireDate(LocalDate hireDate) {
	this.hireDate = hireDate;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getManagerId() {
	return managerId;
}
public void setManagerId(int managerId) {
	this.managerId = managerId;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}

}
