package morningjava;

interface Printer{
	
	void print();
	
	String type = "HP";
	
}

interface Scanner{
	
	void scan();
	
	String type = "DEL";
	
}

interface Camera extends Printer, Scanner{
	
	void recording();
	
	String type = "SONY";
	
}

class SmartDevice implements Printer, Scanner{
	
	public void print() {
		
		System.out.println("The Printer is Printing!");
		
	}
	
	public void scan() {
		
		System.out.println("The Scanner is Scanning!");
		
	}
	
}

class SmartActivity implements Camera{
	
	public void recording() {
		
		System.out.println("This helps in Recording!");
		
	}
	
	public void print() {
		
		System.out.println("This helps in Printing!");
		
	}
	
	public void scan() {
		
		System.out.println("This helps in Scanning!");
		
	}
	
}
public class InterfaceEx {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in); 
		
		System.out.println("1.Smart Devices");
		System.out.println("2.Smart Activities");
		System.out.println("3.Exit");
		System.out.print("Enter Your Choice : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1 : 
		
		}
		
		
		
	}
	
}
