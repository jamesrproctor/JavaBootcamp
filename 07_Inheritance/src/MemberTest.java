import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MemberTest {
	
	@Test
	void testGetName() {
		Member member1 = new Member("James", 23);
		assertEquals("James", member1.getName());
	}
	
	@Test
	void testSetName() {
		Member member1 = new Member("Barry", 20);
		assertEquals("Barry", member1.getName());
		
		member1.setName("Garry");
		assertEquals("Garry", member1.getName());		
	}

	@Test
	void testGetAge() {
		Member member1 = new Member("James", 23);
		assertEquals(23, member1.getAge());
	}
	
	@Test
	void testSetAge() {
		Member member1 = new Member("Barry", 20);
		assertEquals(20, member1.getAge());
		
		member1.setAge(21);
		assertEquals(21, member1.getAge());
	}
	
	@Test
	void testGetBorrowed() {
		Member member1 = new Member("James", 23);
		assertEquals(0, member1.getBorrowed());
	}
	
	@Test
	void testSetBorrowed() {
		Member member1 = new Member("James", 23);
		assertEquals(0, member1.getBorrowed());
		
		member1.setBorrowed(3);
		assertEquals(3, member1.getBorrowed());
	}
	
	@Test
	void testToString() {
		Member member1 = new Member("Tester", 16);
		String expectedString = "";
		assertEquals(expectedString, member1.toString());
	}
	
	@Test
	void testAddBorrowedItems() {
		Member member1 = new Member("James", 23);
		assertEquals(0, member1.getBorrowed());
		
		member1.addBorrowedItems(3);
		assertEquals(member1.getBorrowed(), 3);
		
		member1.addBorrowedItems(9999);
		assertEquals(12, member1.getBorrowed());
	}
	
	@Test
	void testReturnBorrowedItems() {
		Member member1 = new Member("James", 23);
		assertEquals(0, member1.getBorrowed());
		
		member1.setBorrowed(12);
		assertEquals(12, member1.getBorrowed());
		
		member1.returnBorrowedItems(3);
		assertEquals(member1.getBorrowed(), 9);
		
		member1.returnBorrowedItems(9999);
		assertEquals(0, member1.getBorrowed());
	}

}
