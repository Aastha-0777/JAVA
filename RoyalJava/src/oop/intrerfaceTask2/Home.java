package oop.intrerfaceTask2;

public class Home implements Person{

	@Override
	public void getBehave() {

		System.out.println("Home : getBehave() --> Child");

	}
	
	public void getMovieTime() {
		
		System.out.println("Home : Child : getMovieTime() : Movie Time");
		
	}

}
