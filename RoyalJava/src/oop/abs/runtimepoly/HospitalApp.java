package oop.abs.runtimepoly;

import java.util.Scanner;

public class HospitalApp {

	public static void getSpecificTask(HospitalPerson hp) {
		
		hp.performDuty();
		
		if(hp instanceof Doctor) {
			
			Doctor d = (Doctor)hp;
			
			d.prescribeMedicine();
			
		}else if(hp instanceof Nurse) {
			
			Nurse n = (Nurse)hp;
			
			n.assistPatient();
			
		} else if(hp instanceof Patient) {
			
			Patient p = (Patient)hp;

			p.getTreatment();
			
		}else {
			
			Receptionist r = (Receptionist)hp;
			
			r.bookAppointment();
			
		}
		
	}
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		HospitalApp ha = new HospitalApp();
		
		while(true) {
			
			System.out.println("1. Doctor");
			System.out.println("2. Nurse");
			System.out.println("3. Patient");
			System.out.println("4. Receptionist");
			System.out.println("5. Exit");
			System.out.print("Enter from the Above Choice : ");
			int choice = ha.sc.nextInt();
			
			switch(choice) {
			
			case 1 : Doctor d = new Doctor();
					 getSpecificTask(d);
					 break;
					  
			case 2 : Nurse n = new Nurse();
					 getSpecificTask(n);
					 break;
					 
			case 3 : Patient p = new Patient(); 
					 getSpecificTask(p);
					 break;
					 
			case 4 : Receptionist r = new Receptionist();
					 getSpecificTask(r);
					 break;
					 
			case 5 : System.exit(0);
					 break;
					 
			default : System.out.println("Invalid Chocie!!");
			
			}

		
		}
		
	}
	
}
