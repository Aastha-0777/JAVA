package oop.abs.runtimepoly;

public class Nurse extends HospitalPerson{

	@Override
	public void performDuty() {

		System.out.println("Nurse -- performDuty() --> Take History and Assist Doctor");
	
	}
	
	public void assistPatient() {
		
		System.out.println("Nurse : assistPatient() : Assist Patient");
		
	}
	
}
