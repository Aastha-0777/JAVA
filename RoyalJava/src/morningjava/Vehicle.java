package morningjava;

public class Vehicle {

	protected String brand;
	protected int speed;
	
	Vehicle(String brand, int speed){
		
		this.brand = brand;
		this.speed = speed;
		
	}
	
	public void display_info() {
		
		System.out.println("Brand : " + brand);
		System.out.println("Speed : " + speed);
		
	}
	
	
	
}
