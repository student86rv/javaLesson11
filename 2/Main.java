
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
	
	public static void main(String[] args) {
		
		int[] arr = {16, 11, 1986};
		
		Person student = new Person("Ivanov", "Ivan", "Ivanovich", arr);
		Person student2 = new Person("Petrov", "Petr", "Petrovich");
		Person student3 = new Person("Sidorov Sidor Sidorovich");
		
		ArrayList<Person> students = new ArrayList<Person>();
		
		students.add(student);
		students.add(student2);
		students.add(student3);
		
		Calendar start = new GregorianCalendar(2018, Calendar.OCTOBER, 2);
		
		//String courseName, Calendar beginDate, int sumLessons,int lessonsPerWeek,ArrayList students
		Group java02oct = new Group("Introduction Java", start, 16, 2, students);

		System.out.println("courseName and beginDate: "+java02oct.getCourseDate());
		System.out.println("lastweek: "+java02oct.getLastWeek());

		java02oct.printStudents();

		java02oct.addStudent(new Person("Smirnov Andrey Viktorovich"));
		java02oct.printStudents();
	}		
}