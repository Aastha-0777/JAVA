package innerclasstopic.staticclass;

public class Demo {
	
	private static int num = 10;
	
	//Inner Class --------------> Nested Inner Class
	static class Demo2{
		
		void show() {
			
			System.out.println("Num = " + num);
			
		}//end of show
		
	}
	
	public static void main(String[] args) {
		
		Demo.Demo2 obj = new Demo.Demo2();
		
		obj.show();
		
	}
	

}
