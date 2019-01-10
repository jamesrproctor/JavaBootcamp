package javaClassesTraining;

import java.util.Date;

public class Employee {
	
	private String name;
	private double salary;
	private Date joined = new Date();
	private int ID;
	
	private double minimumSalary = 7000;
	// Generates the employee ID by iterating +1 each time an object is created
	public static int nextEmployeeID;
	
	public void payRise(double increaseValue) {
		salary += increaseValue;
	}
	
	public String toString(int ID) {
		String responseString = "Name: " + name + ". Salary: " + salary + ". ID Number: " + ID + ". Date joined: " + joined;
		return responseString;
	}
	
	// Set the employeeID
	{
		ID = nextEmployeeID++;
	}
	// Constructor / init method
	public Employee(String name, double salary) {
		this.name = name;
		if (salary < minimumSalary) {
			this.salary = minimumSalary;
		} else {
			this.salary = salary;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getJoined() {
		return joined;
	}
	public void setJoined(Date joined) {
		this.joined = joined;
	}
	public int getID() {
		return ID;
	}
	
	
	
	
	
	
	}



	


