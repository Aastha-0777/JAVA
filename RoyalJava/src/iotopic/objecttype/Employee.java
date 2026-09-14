package iotopic.objecttype;

import java.io.Serializable;

public class Employee implements Serializable {

	int id;
	String name;
	float salary;
	transient String orgName;
	String dsgn;

	public Employee() {

	}

	public Employee(int id, String name, float salary, String orgName, String dsgn) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.orgName = orgName;
		this.dsgn = dsgn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getDsgn() {
		return dsgn;
	}

	public void setDsgn(String dsgn) {
		this.dsgn = dsgn;
	}
	
	
	
}
