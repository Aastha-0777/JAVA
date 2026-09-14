package oop.abs.runtimepoly;

public class Patient extends HospitalPerson{
	
	@Override
	public void performDuty() {

		System.out.println("Patient -- performDuty() --> Consult Doctor");
	
	}
	
	public void getTreatment() {
		
		System.out.println("Patient : getTreatment() : Get Treatment");
		
	}
	
}
