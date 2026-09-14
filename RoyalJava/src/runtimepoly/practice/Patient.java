package runtimepoly.practice;

public class Patient extends HospitalPerson{
	
	@Override
	public void performDuty() {

		System.out.println("HospitalPerson : Patient --> performDuty() --> Patient");
		
	}
	
	public void getTreatment() {
		
		System.out.println("HospitalPerson : Patient --> getTreatment() --> Get Treatment");
		
	}//end of getTreatment

}
