package com.capgemini.Injecting_dependencies;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private String bu;
	private int age;
	private SBU sbu;
	public Employee()
	{
		
	}
	public Employee(int employeeId, String employeeName, double salary, String bu, int age) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.bu = bu;
		this.age = age;
	}
	public SBU getDetails()
	{
		
		return sbu;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getBu() {
		return bu;
	}
	public void setBu(String bu) {
		this.bu = bu;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + ", bu="
				+ bu + ", age=" + age + "]";
	}
	
	/*public String toString1() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + ", bu="
				+ bu + ", age=" + age +"SBu details:"+ getDetails().toString1() +"]";
	}*/
	
	
}
