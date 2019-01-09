package javaClassesTraining;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
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
		fail("Not yet implemented");
	}

	@Test
	void testEmployee() {
		fail("Not yet implemented");
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
		assertEquals(28000, salary, 0.1);	
	}

	@Test
	void testSetSalary() {
		fail("Not yet implemented");
	}

	@Test
	void testGetJoined() {
		fail("Not yet implemented");
	}

	@Test
	void testSetJoined() {
		fail("Not yet implemented");
	}

	@Test
	void testGetID() {
		fail("Not yet implemented");
	}

}
