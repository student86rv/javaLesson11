
public class Main {
	
	public static void main(String[] args) {
		
		int[] arr = {16, 11, 1986};
		
		Person student = new Person("Ivanov", "Ivan", "Ivanovich", arr);
		
		Person student2 = new Person("Petrov", "Petr", "Petrovich");
		
		Person student3 = new Person("Sidorov Sidor Sidorovich");
		
		System.out.println("Student= "+student);
		System.out.println("Age= "+student.getAge());
		System.out.println();
		
		System.out.println("Student2= "+student2);
		System.out.println("Short name= "+student2.getShortName());
		System.out.println();
		
		System.out.println("Student3="+student3);
		System.out.println("Full name= "+student3.getFullName());
	}		
}