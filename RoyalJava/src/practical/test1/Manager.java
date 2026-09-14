package practical.test1;

public class Manager implements Employee{

	@Override
	public void work() {
		
		System.out.println("Manager : work() --> Managing");
		
	}
	
	public void conductMeeting() {
		
		System.out.println("Manager : conductMeeting() : Conduct Meeting");
		
	}
	
	
}
