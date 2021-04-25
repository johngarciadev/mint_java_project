package mint;

public class Instructor {
	
	private String firstName;
	private String lastName;
	private String birthday;
	
	public Instructor(String firstName, String lastName, String birthday) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public void setBirthday(String newBirthday) {
		birthday = newBirthday;
	}
	
}
