package morningjava;

public class Car2 extends Vehicle{
	
	Car2(String brand, int speed){
		
		super(brand, speed);
		
	}
	
	public void honk() {
		
		System.out.println("The " + brand + " is Honking!");
		
	}
	
	public static void main(String[] args) {
		
		Car2 c = new Car2("BMW", 467);
		
		c.honk();
		c.display_info();
		
	}

}
