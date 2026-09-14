package object.practice;

public class Student {

	int studentId;
	int age;
	String studentName;
	String course;
	
	public Student() {}

	public Student(int studentId, int age, String studentName, String course) {

		this.studentId = studentId;
		this.age = age;
		this.studentName = studentName;
		this.course = course;
	}
	
	public void displayData() {
		
		System.out.println("Name : " + studentName);
		System.out.println("Id : " + studentId);
		System.out.println("Age : " + age);
		System.out.println("Course : " + course);
		
		System.out.println("--------------------------------");
		
	}//end of displayData
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, 18, "Radha", "Computer Science");
		Student s2 = new Student(2, 20, "Krishna", "Electrical Engg.");
		Student s3 = new Student(3, 17, "Vasudev", "Mechatronics Engg.");
		
		s1.displayData();
		s2.displayData();
		s3.displayData();
		
	}	
	
}
