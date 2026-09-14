package innerclasstopic.memberclass;

public class SyntaxOfInnerClass {

	int no = 67;
	
	class innerClass{
		
		void show() {
			
			System.out.println("Inner Class ---> no : " + no);
			
		}
				
	}
	
	public static void main(String[] args) {
		
		SyntaxOfInnerClass objOuterClass = new SyntaxOfInnerClass();
		
		SyntaxOfInnerClass.innerClass objInnerClass = objOuterClass.new innerClass();
		
		objInnerClass.show();		
		
		
	}
	
}
