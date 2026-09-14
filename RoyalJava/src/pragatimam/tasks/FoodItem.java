package pragatimam.tasks;

public abstract class FoodItem {

	private String name;
	private double price;
	
	FoodItem(String name, double price){
		
		this.name = name;
		this.price = price;
		
	}//end of constructor
	
	public String getName(){
		
		return this.name;
		
	}
	
	public double getPrice() {
		
		return this.price;
		
	}
	
	public abstract void prepare();
	
}
