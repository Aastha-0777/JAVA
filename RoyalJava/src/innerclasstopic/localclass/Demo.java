package innerclasstopic.localclass;

public class Demo {
	
	void localClassDemo() {
		
		class LocalClass{
			
			void show() {
				
				System.out.println("Local Class : show()");
				
			}
			
		}
		
		LocalClass objLC = new LocalClass();
		
		objLC.show();
		
	}
	

	public static void main(String[] args) {
		
		Demo objD = new Demo();
		
		objD.localClassDemo();
		
		
	}
	

}
