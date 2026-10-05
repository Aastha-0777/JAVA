package collectionfrmk.sortingtechniques.cmprble;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployeeOnName {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Aastha", 12345, "SE");
		Employee e2 = new Employee(2, "Greesha", 3456789, "Manager");
		Employee e3 = new Employee(8, "Shreya", 234567, "UI/UXDesi.");
		Employee e4 = new Employee(45, "Zaara", 3456789, "Dev.");
		Employee e5 = new Employee(3, "Riya", 4567890, "WebDev.");
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		System.out.println("Employees Before Sorting : ");
		
		for (Employee employee : empList) {
			
			System.out.println(employee.getEmpId() + " " + employee.getName() + " " + employee.getSalary() + " " + employee.getDsgn());
			
		}
		
		Collections.sort(empList);
		
		System.out.println("Employees After Sorting : ");
		
		for (Employee employee : empList) {
			
			System.out.println(employee.getEmpId() + " " + employee.getName() + " " + employee.getSalary() + " " + employee.getDsgn());
			
		}
		
	}

}
