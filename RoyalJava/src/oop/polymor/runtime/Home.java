package oop.polymor.runtime;

public class Home extends Person{
	
	@Override
	public void getBehave() {
		
		System.out.println("Home - getBehave() --> Child Behaviour");
		
	}//end of getBehave
	
	public void getMovieTime() {
		
		System.out.println("Home : getMovieTime : Movie Time");
		
	}//end of getMovieTime 
	
}
