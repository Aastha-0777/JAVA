package runtimepoly.practice;

public class Receptionist extends HospitalPerson{
	
	@Override
	public void performDuty() {

		System.out.println("HospitalPerson : Receptionist --> performDuty() --> Receptionist");
	
	}
	
	public void bookAppointment() {
		
		System.out.println("HospitalPerson : Receptionist --> bookAppointment() --> Book Appointment");
		
	}//end of bookAppointment

}
