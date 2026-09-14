package morningjava;

public class Amazon extends Person{

	private String proName;
	private String dilivAdd;
	private String orderDate;
	
	public void getAmzData() {
		
		System.out.print("Enter the Product Name : ");
		proName = sc.nextLine();
		System.out.print("Enter the Dilivery Add");
		
	}
	
}
