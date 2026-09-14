package oop.abs.runtimepoly;

import java.util.Scanner;

public class TestApp {

	public static void getSpecificMethod(Person p) {
		
		p.getBehave();
		
		if(p instanceof School) {
			
			School s = (School)p;
			
			s.getResult();
			
		}else if(p instanceof Org) {
			
			Org o = (Org)p;
			
			o.getSalary();
			
		}else if(p instanceof PublicPlace) {
			
			PublicPlace pp = (PublicPlace)p;
			
			pp.getPublicEventInfo();
			
		}else if(p instanceof Home) {
			
			Home h = (Home)p;
			
			h.getMovieTime();
			
		}
		
	}
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		TestApp t = new TestApp();
		
		while(true) {
			
			System.out.println("1. School");
			System.out.println("2. Org");
			System.out.println("3. Public Place");
			System.out.println("4. Home");
			System.out.println("5. Exit");
			System.out.print("Enter from the Above Choice : ");
			int choice = t.sc.nextInt();
			
			switch(choice) {
			
			case 1 :  School s = new School();
					  getSpecificMethod(s);
					  break;
					  
			case 2 : Org o = new Org();
					 getSpecificMethod(o);
					 break;
					 
			case 3 : PublicPlace p = new PublicPlace();
					 getSpecificMethod(p);
					 break;
					 
			case 4 : Home h = new Home();
					 getSpecificMethod(h);
					 break;
					 
			case 5 : System.exit(0);
					 break;
					 
			default : System.out.println("Invalid Chocie!!");
			
			}
			
		}
		
	}
	
}
