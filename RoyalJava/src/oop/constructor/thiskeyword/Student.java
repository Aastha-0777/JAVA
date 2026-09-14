package oop.constructor.thiskeyword;

public class Student {

	int rollNo;
	String name;
	int std;
	int marks;
	
	/*
	 
	 this can be used as :
	  1.constructor 
	  2.keyword
	  3.object
	 
	 */
	
	Student(){
		
		System.out.println("============ Start :: Default Constructor =============");
		
		System.out.println(rollNo + " " + name + " " + std + " " + marks);

		rollNo = 1;
		name = "Aastha";
		std = 12;
		marks = 100;
	
		System.out.println(rollNo + " " + name + " " + std + " " + marks);
		
		System.out.println("============ Exit :: Default Constructor =============");
		
	}//end of default constructor
	
	Student(int rollNo, String name){
		
		System.out.println("============ Start :: Two - Parameter Constructor =============");
		
		this.rollNo = rollNo;
		this.name = name;
		
		System.out.println("============ Exit :: Two - Parameter Constructor =============");
		
	}//end of two - Parameter Constructor
	
	Student(int rollNo, String name, int std){

		this(rollNo, name);// to call constructor in a constructor
		System.out.println("============ Start :: Three - Parameter Constructor =============");
		
		this.std = std;
		
		System.out.println("============ Exit :: Three - Parameter Constructor =============");
		
	}//end of three - Parameter Constructor
	
	Student(int rollNo, String name, int std, int marks){
		
		this(rollNo, name, std);
		System.out.println("============ Start :: Four - Parameter Constructor =============");
		
		this.marks = marks;
		
		System.out.println("============ Exit :: Four - Parameter Constructor =============");
		
	}//end of four - Parameter Constructor
	
	Student(Student s){
		
		rollNo = s.rollNo;
		name = s.name;
		std = s.std;
		marks = s.marks;
		
	}//end of parameter - Copy Constructor
	
	public void disDetails() {
		
		System.out.println(rollNo + " " + name + " " + std + " " + marks);
		
	}//end of disDetails
	
	public static void main(String[] args) {
		
		System.out.println("============== Start :: Main Function =============");
		
		Student s1 = new Student();
		Student s2 = new Student(2, "Aarav");
		Student s3 = new Student(3, "Mrugana", 12);
		Student s4 = new Student(4, "Shrusti", 12, 100);
		Student s5 = new Student(s1);
		
		s1.disDetails();
		s2.disDetails();
		s3.disDetails();
		s4.disDetails();
		s5.disDetails();
		
		System.out.println("============== Exit :: Main Function =============");
		
	}
	
}
