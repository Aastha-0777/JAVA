package oop.herhInheritance;

public class EmpTestApp1 {

	public static void main(String[] args) {
		
		TechEmployee techEmp = new TechEmployee();
		NonTechEmployee nonTechEmp = new NonTechEmployee();
		
		techEmp.scanData();
		techEmp.disData();
		
		System.out.println("-----------------------------------------------------------");
		
		nonTechEmp.scanData();
		nonTechEmp.disData();
		
	}
	
}
