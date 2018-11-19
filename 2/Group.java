
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Group {

	private String courseName;
	private Calendar beginDate;
	private int sumLessons;
	private int lessonsPerWeek;
	private ArrayList students;
	private Person newStudent;

	public Group() {
	}

	public Group(String courseName, Calendar beginDate, int sumLessons, int lessonsPerWeek, ArrayList students) {
		this.courseName = courseName;
		this.beginDate = beginDate;
		this.sumLessons = sumLessons;
		this.lessonsPerWeek = lessonsPerWeek;
		this.students = students;
	}

	public String getCourseDate() {
		return courseName + " " + convertDate(beginDate);
	}

	public String getLastWeek() {
		int lastWeekIndex = sumLessons / lessonsPerWeek - 1;
		Calendar lastWeek = new GregorianCalendar();
		lastWeek.set(Calendar.YEAR, beginDate.get(Calendar.YEAR));
		lastWeek.set(Calendar.MONTH, beginDate.get(Calendar.MONTH));
		lastWeek.set(Calendar.DAY_OF_MONTH, beginDate.get(Calendar.DAY_OF_MONTH));
		lastWeek.add(Calendar.WEEK_OF_YEAR, lastWeekIndex);
		lastWeek.set(Calendar.DAY_OF_WEEK, 2);
		return convertDate(lastWeek);
	}

	public void addStudent(Person newStudent) {
		students.add(newStudent);
		System.out.println("Students List updated!");
	}

	public void printStudents() {
		for (int i = 0; i < students.size(); i++) {
			System.out.println("Student "+ (i+1) +": " + students.get(i));
		}
	}

	public String convertDate(Calendar date) {
		SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
		return format1.format(date.getTime());
	}
//	public boolean searchStudent (String lastName) {
//
//	}

	public String toString() {
		return "Group{" +
				" " + courseName +
				", " + convertDate(beginDate) +
				", " + lessonsPerWeek +
				", " + sumLessons +
				", " + students +
				"}";
	}
}