package practical.test;

public class Student {

	/*
	 * 
	 * 	Create a Java Student Management Program using OOP:
		Create a Student class.
		Variables: id, name, marks.
		Create methods:
		displayStudent()
		calculatePercentage()
		calculateGrade()
		Create objects for 3 students and display their results.
	 * */
	
	int id;
	String name;
	int maths, sci, eng;
	float marks;
	char grade;
	
	public Student(int id, String name, int maths, int sci, int eng) {

		this.id = id;
		this.name = name;
		this.maths = maths;
		this.sci = sci;
		this.eng = eng;
		
	}
	
	public void displayStudent() {

		System.out.println("Name : " + name);
		System.out.println("Id : " + id);
		System.out.println("Marks : " + marks);
		System.out.println("Grade : " + grade);

	}
	
	public void calculatePercentage() {

		marks = (float)((maths + sci + eng) / 3);

	}
	
	public void calculateGrade() {

		if(marks >= 35) {
			
			grade = 'P';
			
		}else {
			
			grade = 'F';
			
		}

	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Ram", 50, 67, 90);
		
		s1.calculatePercentage();
		s1.calculateGrade();
		s1.displayStudent();
		
		Student s2 = new Student(2, "Sita", 55, 97, 40);
		
		s2.calculatePercentage();
		s2.calculateGrade();
		s2.displayStudent();
		
		Student s3 = new Student(3, "Vasudev", 50, 37, 70);
		
		s3.calculatePercentage();
		s3.calculateGrade();
		s3.displayStudent();
		
	}
	
}
