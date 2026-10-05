package collectionfrmk.sortingtechniques.cmprble;

public class Product implements Comparable<Product>{

	private int pId;
	private String pName;
	private double pPrice;
	private String pDisc;
	
	public Product() {}

	public Product(int pId, String pName, double pPrice, String pDisc) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pDisc = pDisc;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getpPrice() {
		return pPrice;
	}

	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}

	public String getpDisc() {
		return pDisc;
	}

	public void setpDisc(String pDisc) {
		this.pDisc = pDisc;
	}

	@Override
	public int compareTo(Product p) {

		if(getpPrice() < p.getpPrice()) {
			
			return 1;
			
		}else if(getpPrice() > p.getpPrice()) {
			
			return -1;
			
		}else {
			
			return 0;
			
		}
		
	}
	
	
	
}
