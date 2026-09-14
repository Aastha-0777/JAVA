package collectionfrmk.listtopic;

public class Employee {
	
	private int empId;
	private String orgn;
	private String occupation;
	private float sallary;
	private String name;
	
	public Employee(int empId, String orgn, String occupation, float sallary, String name) {
		super();
		this.empId = empId;
		this.orgn = orgn;
		this.occupation = occupation;
		this.sallary = sallary;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getOrgn() {
		return orgn;
	}

	public void setOrgn(String orgn) {
		this.orgn = orgn;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public float getSallary() {
		return sallary;
	}

	public void setSallary(float sallary) {
		this.sallary = sallary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
