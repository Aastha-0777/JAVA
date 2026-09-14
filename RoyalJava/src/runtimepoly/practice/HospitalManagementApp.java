package runtimepoly.practice;

import java.util.Scanner;

public class HospitalManagementApp {

	public static void getSpecificMethods(HospitalPerson hp) {
		
		hp.performDuty();
		
		if(hp instanceof Doctor) {
			
			Doctor d = (Doctor)hp;
			
			d.prescribeMedicine();
			
		}else if(hp instanceof Nurse) {
			
			Nurse n = (Nurse)hp;
			
			n.assistPatient();
					
		}else if(hp instanceof Patient) {
			
			Patient p = (Patient)hp;
			
			p.getTreatment();
			
		}else {
			
			Receptionist r = (Receptionist)hp;
			
			r.bookAppointment();
			
		}//end of if - else ladder
		
	}//end of getSpesificMethods
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		HospitalManagementApp hma = new HospitalManagementApp();
		
		while(true) {
			
			System.out.println("------------------ Hospital Management System ------------------");
			System.out.println("1. Doctor");
			System.out.println("2. Nurse");
			System.out.println("3. Patient");
			System.out.println("4. Receptionist");
			System.out.println("5. Exiting the Hospital Management System");
			System.out.print("Enter from the Above Choices : ");
			int choice = hma.sc.nextInt();
			
			switch(choice) {
			
			case 1 : {
				
					Doctor d = new Doctor();
					getSpecificMethods(d);
				
			} break;
			
			case 2 : {
				
					Nurse n = new Nurse();
					getSpecificMethods(n);
				
			} break;
			
			case 3 : {
				
					Patient p = new Patient();
					getSpecificMethods(p);
				
			} break;
			
			case 4 : {
				
					Receptionist r = new Receptionist();
					getSpecificMethods(r);
				
			} break;
			
			case 5 : {
				
					System.out.println("Exiting the Hospital Management System...");
					System.exit(0);
				
			} break;
			
			default : System.out.println("Invaild Choice!!");
			
			}//end of switch
			
		}//end of while
		
	}//end of main
	
}
