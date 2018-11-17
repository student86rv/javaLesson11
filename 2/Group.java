
import java.util.ArrayList;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Group {
	
	String courseName;
	Date beginDate;
	int sumLessons;
	int lessonsPerWeek;
	ArrayList students;
	
	public Group() {
	}
	
	public Group(String courseName, Date beginDate, int sumLessons,int lessonsPerWeek,ArrayList students) { 
		this.courseName = courseName;
		this.beginDate = beginDate;
		this.sumLessons = sumLessons;
		this.lessonsPerWeek = lessonsPerWeek;
		this.students = students;
	}
	
	public String toString() {
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
		String sData = format1.format(beginDate);
		
		return "Group{" +
		" " + courseName +
		", " + sData +
		", " +lessonsPerWeek +
		", " + sumLessons +
		", " + students +
		"}";
	}
	
	
	
}