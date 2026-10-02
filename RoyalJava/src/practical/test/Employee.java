package practical.test;

public class Employee {

	private int empId;
	private String name;
	private String dsgn;
	private double salary;
	private String orgName;
	public Employee(int empId, java.lang.String name, java.lang.String dsgn, double salary, String orgName) {
		super();
		this.empId = empId;
		this.name = name;
		this.dsgn = dsgn;
		this.salary = salary;
		this.orgName = orgName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDsgn() {
		return dsgn;
	}
	public void setDsgn(String dsgn) {
		this.dsgn = dsgn;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	
	
	
}
