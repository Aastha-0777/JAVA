package collectionfrmk.sortingtechniques.cmprble;

public class Employee implements Comparable<Employee>{

	private int empId;
	private String name;
	private int salary;
	private String dsgn;
	
	public Employee() {}

	public Employee(int empId, String name, int salary, String dsgn) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.dsgn = dsgn;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDsgn() {
		return dsgn;
	}

	public void setDsgn(String dsgn) {
		this.dsgn = dsgn;
	}

	@Override
	public int compareTo(Employee e) {

		return getName().compareTo(e.getName());

	}
	
	
	
}
