package runtimepoly.practice;

public class Doctor extends HospitalPerson{
	
	@Override
	public void performDuty() {

		System.out.println("HospitalPerson : Doctor --> performDuty() --> Doctor");
	
	}
	
	public void prescribeMedicine() {
		
		System.out.println("HospitalPerson : Doctor --> prescribeMedicine() --> Prescribe Medicine");
		
	}//end of prescribeMedicine

}
