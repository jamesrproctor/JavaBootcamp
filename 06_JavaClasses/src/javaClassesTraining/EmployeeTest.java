package javaClassesTraining;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Date;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testPayRise() {
		Employee employee1 = new Employee("Gareth", 26000);
		double salary = employee1.getSalary();
		assertEquals(salary, 26000, 0.001);
		
		employee1.payRise(2000);
		double changedSalary = employee1.getSalary();
		assertEquals(28000, changedSalary, 0.1);
	}

	@Test
	void testToStringInt() {
		Employee employee1 = new Employee("Bill", 22000);
		int IDNumber = employee1.getID();
		String stringReturn = employee1.toString(IDNumber);
		String manuallyTyped = "Name: Bill. Salary: 22000. ID Number: " + IDNumber + ". Date joined: " + new Date();
		
		assertEquals(stringReturn, manuallyTyped);
	}

	@Test
	void testGetName() {
		Employee employee1 = new Employee("Gareth", 26000);
		String name = employee1.getName();
		
		assertEquals("Gareth", name);	
	}

	@Test
	void testSetName() {
		Employee employee1 = new Employee("Gareth", 26000);
		String name = employee1.getName();
		assertEquals("Gareth", name);
		
		employee1.setName("Barreth");
		String changedName = employee1.getName();
		assertEquals("Barreth", changedName);
	}

	@Test
	void testGetSalary() {
		Employee employee1 = new Employee("Gareth", 26000);
		double salary = employee1.getSalary();
		assertEquals(salary, 26000, 0.001);
		
		employee1.setSalary(28000);
		double changedSalary = employee1.getSalary();
		assertEquals(28000, changedSalary, 0.1);	
	}

	@Test
	void testSetSalary() {
		Employee employee1 = new Employee("Haley", 24500);
		double salary = employee1.getSalary();
		assertEquals(salary, 24500, 0.001);
		
		employee1.setSalary(28700);
		double changedSalary = employee1.getSalary();
		assertEquals(28700, changedSalary, 0.1);	
	}

	@Test
	void testGetJoined() {
		Employee employee1 = new Employee("Tina", 26000);
		Date joined = employee1.getJoined();
		assertEquals(joined, new Date());
	}

	@Test
	void testGetID() {
		fail("Not yet implemented");
	}

}
