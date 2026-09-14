package practical.test1;

import java.util.Scanner;

public class TestApp {
	
	Scanner sc = new Scanner(System.in);
	
	public static void employeeWork(Employee emp) {
		
		emp.work();
		
		if(emp instanceof Developer) {
			
			Developer d = (Developer)emp;
			
			d.writeCode();
			
		}else if(emp instanceof Tester){
			
			Tester t = (Tester)emp;
			
			t.testSoftware();
			
		} else if(emp instanceof Manager) {
			
			Manager m = (Manager)emp;
			
			m.conductMeeting();
			
		}
		
	}
	
	public static void main(String[] args) {
		
		TestApp ta = new TestApp();
		
		while(true) {
			
			System.out.println("1. Developer");
			System.out.println("2. Tester");
			System.out.println("3. Manager");
			System.out.println("4. Exit");
			System.out.print("Enter Your Choice : ");
			int choice = ta.sc.nextInt();
			
			switch(choice) {
			
			case 1 : Developer d = new Developer();
					 employeeWork(d);
					 break;
					 
			case 2 : Tester t = new Tester();
					 employeeWork(t);
					 break;
					 
			case 3 : Manager m = new Manager();
					 employeeWork(m);
					 break;
					 
			case 4 : System.exit(0);
				 	 break;
				 	 
			default : System.out.println("Invalid Choice!!");
			
			}//end of switch
			
			
		}//end of while
		
	}

}
