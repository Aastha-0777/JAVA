package pragatimam.tasks;

public class Employee {

	int empId;
	String name;
	int salary;
	
	Employee(int eId, String n, int s){
		
		empId = eId;
		name = n;
		salary = s;
		
	}//end of constructor
	
	void display() {
		
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Salary : " + salary);
		 
	}//end of display
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Aastha", 4567);
		Employee e2 = new Employee(102, "Aarav", 45678);
		Employee e3 = new Employee(103, "Vasudev", 78990);
		
		System.out.println("============== EMP DETAILS =============");
		e1.display();
		System.out.println();	
		e2.display();
		System.out.println();
		e3.display();
		
		System.out.println("============= EMP WITH MAX SAL =============");
		
		if(e1.salary > e2.salary && e1.salary > e3.salary) {
			
			e1.display();
			
		}else if(e2.salary > e1.salary && e2.salary > e3.salary) {
			
			e2.display();
			
		}else {
			
			e3.display();
			
		}//end of if-else ladder
		
		
		
	}
	
}
