package oop.abs.runtimepoly;

public class Receptionist extends HospitalPerson{

	@Override
	public void performDuty() {

		System.out.println("Receptionist -- performDuty() --> See the Reception");
	
	}
	
	public void bookAppointment() {
		
		System.out.println("Receptionist : bookAppointment() : Book Appointment");
		
	}
	
}
