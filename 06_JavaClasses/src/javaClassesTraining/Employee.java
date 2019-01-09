package javaClassesTraining;

import java.util.Date;

public class Employee {
	
	private String name;
	private int salary;
	private Date joined = new Date();
	private int ID;
	
	public void payRise(double increaseValue) {
		salary += increaseValue;
	}
	
	public String toString(int ID) {
		String responseString = "Name: " + name + "Salary: " + salary + "ID Number: " + ID + "Date joined: " + joined;
		return responseString;
		
	}
	
	
	
	
	
	
	}

	


