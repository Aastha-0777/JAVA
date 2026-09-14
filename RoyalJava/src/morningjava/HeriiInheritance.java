//package morningjava;
//
//class Vehical{
//	
//	String brand;
//	
//	Vehical(String brand2, float speed) {
//
//		brand = "Indian";
//		System.out.println("This is the Parent Class : Vehical");
//		
//	}
//	
//	void start() {
//		
//		System.out.println("The Vehical hasbeen Started!!");
//		
//	}
//	
//}
//
//class Car2 extends Vehical{
//	
//	int doorNo;
//	
//	Car2() {
//		
//		doorNo = 4;
//		
//		System.out.println("This is the Child Class : Car");
//		
//	}
//	
//	void drive() {
//		
//		System.out.println("The Car is Driving on 4 wheels!!");
//		
//	}
//	
//}
//
//class Bike2 extends Vehical{
//	
//	boolean hasCarrier;
//	
//	Bike2() {
//
//		hasCarrier = true;
//		
//		System.out.println("This is the Child Class : Bike");
//
//	}
//	
//	void ride() {
//		
//		System.out.println("The Bike is Riding on 2 Wheels!!");
//		
//	}
//	
//}
//
//public class HeriiInheritance {
//
//	public static void main(String[] args) {
//		
//		Car2 objCar = new Car2();
//		Bike2 objBike = new Bike2();
//	
//		objCar.brand = "maruti";
//		System.out.println("The Brand of Car is : " + objCar.brand);
//		System.out.println("The No of Door in the Car is : " + objCar.doorNo);
//		objCar.start(); 
//		objCar.drive();
//		
//		objBike.brand = "Yamana";
//		System.out.println("The Brand of Bike is : " + objBike.brand);
//		System.out.println("Do Bike have a Carrier : " + objBike.hasCarrier);
//		objBike.start();
//		objBike.ride();
//		 
//	}
//	
//}
