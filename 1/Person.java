
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Person {
	
	String firstName;
	String lastName;
	String fatherName;
	String fullName;
	
	String[] names = new String[3];
	int[] birthDate = new int[3];
			
	public Person(String lastName, String firstName, String fatherName, int[] birthDate) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.fatherName = fatherName;
		this.birthDate = birthDate;
	}
	
	public Person(String lastName, String firstName, String fatherName) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.fatherName = fatherName;		
	}
		
	public Person(String fullName) {
		names = fullName.split("\\s");
		this.lastName = names[0];
		this.firstName = names[1];
		this.fatherName = names[2];
	}
	
	public String getFullName() {
		return lastName + " " + firstName + " " + fatherName;
	}
	
	public String getShortName() {
		return lastName + " " + firstName.charAt(0) + "." + " " + fatherName.charAt(0) + ".";
	}
	
	public int getAge() {	
		String currentDate = new SimpleDateFormat("dd MM yyyy").format(Calendar.getInstance().getTime());
		String[]splCurrDate = currentDate.split("\\s");
		int[] dateInNumbers = new int[3];
		for(int i = 0;i < dateInNumbers.length; i++) {
			dateInNumbers[i] = Integer.parseInt(splCurrDate[i]);
		}
		int age = dateInNumbers[2] - birthDate[2] - 1;
		if(dateInNumbers[1] - birthDate[1] > 0 || (dateInNumbers[1] - birthDate[1] == 0 && dateInNumbers[0] - birthDate[0] >= 0)) {
			age++;
		}
		return age;
	}
		
	public String toString() {
		return "Person{" +
		" " + lastName +
		", " + firstName +
		", " + fatherName +
		", " + Arrays.toString(birthDate) +
		"}";
	}
}