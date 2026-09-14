package oop.polymor.runtime;

import java.util.Scanner;

public class Test {
	
	public static void getBehaveByPlace(Person person) {
		
		person.getBehave();
		
		if(person instanceof Student) {
			
			Student obj = (Student)person;
			
			obj.getResult();
			
		}else if(person instanceof Org) {
			
			Org obj = (Org)person;
			
			obj.getSalary();
			
		}else if(person instanceof PublicPlace) {
			
			PublicPlace obj = (PublicPlace)person;
			
			obj.getPublicEentInfo();
			
		}else if(person instanceof Home) {
			
			Home obj = (Home)person;
			
		}//end of else - if ladder
		
		
	}//end of getBehaveByPlace

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1) For Student.");
		System.out.println("2) For Org.");
		System.out.println("3) For PublicPlace.");
		System.out.println("4) For Home.");
		System.out.print("Enter from the above Choice : ");
		int choice = sc.nextInt();

		switch(choice) {
		
		case 1 : Student student = new Student();
				 getBehaveByPlace(student);
				 break;

		case 2 : Org org = new Org();
			     getBehaveByPlace(org);
				 break;

		case 3 : PublicPlace publicPlace = new PublicPlace();
			 	 getBehaveByPlace(publicPlace);
				 break;

		case 4 : Home home = new Home();
				 getBehaveByPlace(home);
				 break;

		default : System.out.println("Invalid Chocie!!");
		
		}//end of switch

		
	}
	
}