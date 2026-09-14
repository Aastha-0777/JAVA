package innerclasstopic.ai;

public class Test1 {

	public static void main(String[] args) {
		
		A obj = new A() {
			
			@Override
			public void show() {

				System.out.println("A : show()");
	
			}
			
		};
		
		obj.show();
		
	}
	
}
