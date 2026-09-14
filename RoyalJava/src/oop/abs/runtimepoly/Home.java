package oop.abs.runtimepoly;

public class Home extends Person{
	
	@Override
	public void getBehave() {

		System.out.println("Home -- gerBehave() --> Child Behaviour");
	
	}
	
	public void getMovieTime() {
		
		System.out.println("Home : Child : getMovieTime() : Movie Time");
		
	}

}
