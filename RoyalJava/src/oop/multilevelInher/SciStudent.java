package oop.multilevelInher;

public class SciStudent extends Student{
	
	String sub;
	
//	public SciStudent() {
//		
//		System.out.println("SciStudent : Default Const.");
//		
//	}//end of default Constructor
//	
//	public SciStudent(String name, int rollNo, int std, int marks, String sub) {
//		
//		super(name, rollNo, std, marks);
//		this.sub = sub;
//		
//		System.out.println("SciStudent : Para Const.");
//		
//	}//end of Parameter Constructor

	public void scanSciStdData() {
		
		scanStdData();
		sc.nextLine();
		System.out.print("Enter the Subject : ");
		sub = sc.nextLine();
		
	}//end of scanSciStdData
	
	public void disData() {
		
		System.out.println(rollNo + " " + name + " " + std + " " + marks + " " + sub);
		
	}//end of disData

	public static void main(String[] args) {
		
		SciStudent sci = new SciStudent();
		
		sci.scanSciStdData();
		sci.disData();
		
	}
	
}
