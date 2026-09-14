package oop.abs.runtimepoly;

public class Doctor extends HospitalPerson{
	
	@Override
	public void performDuty() {

		System.out.println("Doctor -- performDuty() --> Check Patient");
	
	}
	
	public void prescribeMedicine() {
		
		System.out.println("Doctor : prescribeMedicine() : Prescribe Medicine");
		
	}

}
