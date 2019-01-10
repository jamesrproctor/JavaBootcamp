
public class Member {
	
	// Class vars
	private String name;
	private int age;
	private int borrowed;
	
	private int maxBorrowed = 12;
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
	
		
	

}
