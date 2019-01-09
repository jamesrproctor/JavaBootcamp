package javaClassesTraining;

import static 



public class testEmployeeActions {

	public static void main(String[] args) {
		setUp();
		testToStringMethod();
		testPayRiseMethod();		
		tearDown();

	}
	private static void setUp() {
		// Use constructor method to create multiple test instances
		System.out.println("Running test setUp method");
		
		// Create mock employee objects
		
		Employee employee1 = new Employee("Alfred", 18000);
	}

	private static void testPayRiseMethod() {
		// Test to assert functionality in payRise method
		System.out.println("Running test payRise method");

		// initialise mock Alfred
		// assert that Alfred has been created
		// assert that Alfred has a salary of 18000
		
		// Test rounded rise
		// initialise mock Alfred
		// Use payrise method to increase salary by 4000
		// assert that Alfred has a salary of 22000
		
		// Test float rise
		// initialise mock Alfred
		// Use payrise method to increase salary by 2000.59
		// assert that Alfred has a salary of 20000.59
		
		// Test pay reduction
		// initialise mock Alfred
		// use payrise method to 'increase' salary by -2000
		// assert that Alfred has a salary of 16000
	}

	private static void testToStringMethod() {
		// Test to assert functionality in payRise method
		System.out.println("Running test toString method");
		
		// init mock barreth
		// test to String method
		// assert that string is as expected
		
		// change Name
		// assert correct 
		
		// change salary
		// asset correct
		
		// change salary and name
		// assert correct
	}

	private static void tearDown() {
		// Methods to clean up after tests have run
		
		// Destroy mock objects
		
	}



}
