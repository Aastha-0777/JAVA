package collectionfrmk.sortingtechniques.cmprble;

import java.util.ArrayList;
import java.util.Collections;

public class SortStudentData {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Aastha", 10, 67);
		Student s2 = new Student(29, "Greesha", 12, 77);
		Student s3 = new Student(45, "Riya", 9, 89);
		Student s4 = new Student(137, "Shreya", 10, 99);
		Student s5 = new Student(3, "Drashti", 12, 86);
		
		ArrayList<Student> stdList = new ArrayList<Student>();
		
		stdList.add(s1);
		stdList.add(s2);
		stdList.add(s3);
		stdList.add(s4);
		stdList.add(s5);
		
		System.out.println("List before sorting : ");
		
		for (Student student : stdList) {
			
			System.out.println(student.getRollNo() + " " + student.getName() + " " + student.getStd() + " " + student.getMarks());
			
		}
		
		Collections.sort(stdList);
		
		System.out.println("List after sorting : ");
		
		for (Student student : stdList) {
			
			System.out.println(student.getRollNo() + " " + student.getName() + " " + student.getStd() + " " + student.getMarks());
			
		}
		
	}

}
