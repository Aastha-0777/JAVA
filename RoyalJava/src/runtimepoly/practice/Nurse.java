package runtimepoly.practice;

public class Nurse extends HospitalPerson{
	
	@Override
	public void performDuty() {

		System.out.println("HospitalPerson : Nurse --> performDuty() --> Nurse");
	
	}
	
	public void assistPatient() {
		
		System.out.println("HospitalPerson : Nurse --> assistPatient() --> Assist Patient");
		
	}//end of assistPatient

}
