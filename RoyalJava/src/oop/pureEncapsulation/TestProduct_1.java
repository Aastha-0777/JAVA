package oop.pureEncapsulation;

public class TestProduct_1 {

	public static void main(String[] args) {
		
		Products p1 = new Products();
		
		p1.setPId(1);
		p1.setPName("Asics Gel");
		p1.setPCatgr("Running Shoes");
		
		System.out.println(p1.getPId() + " " + p1.getPName() + " " + p1.getPCatgr());
		
	}
	
}
