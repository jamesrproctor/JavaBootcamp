
public class Member {
	
	// Class vars
	private String name;
	private int age;
	
	private int borrowed = 0;
	private int maxBorrowed = 12;
	private int minBorrowed = 0;
	private int minAge = 11;
	
	// Constructor / init method
	public Member(String name, int age) {
		this.name = name;
		if (age < minAge) {
			this.age = minAge;
		} else {
			this.age = age;
		}
	}
	
	// Get methods
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getBorrowed() {
		return borrowed;
	}
	
	// Set methods
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public void setBorrowed(int newBorrowed) {
		this.borrowed = newBorrowed;
	}
	
	// to string
	public String toString() {
		String responseString = "Name: " + name + ". Age: " + age + ". Total borrowed: " + borrowed;
		return responseString;
	}
	
	// Add and remove borrowed items
	public void addBorrowedItems(int numOfItems) {
		if (borrowed + numOfItems > maxBorrowed) {
			this.borrowed = maxBorrowed;
		}
		else if (borrowed + numOfItems < minBorrowed) {
			this.borrowed = minBorrowed;
		}
		else {
			this.borrowed = borrowed + numOfItems;
		}
	}
	
	public void returnBorrowedItems(int numOfItems) {
		if (borrowed - numOfItems > maxBorrowed) {
			this.borrowed = maxBorrowed;
		}
		else if (borrowed - numOfItems < minBorrowed) {
			this.borrowed = minBorrowed;
		}
		else {
			this.borrowed = borrowed - numOfItems;
		}
	}
	
	
	
		
	

}
