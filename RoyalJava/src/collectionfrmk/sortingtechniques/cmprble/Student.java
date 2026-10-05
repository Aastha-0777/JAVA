package collectionfrmk.sortingtechniques.cmprble;

public class Student implements Comparable<Student> {
	
	private int rollNo;
	private String name;
	private int std;
	private int marks;
	
	public Student() {}

	public Student(int rollNo, String name, int std, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Student s1) {
		
		if(getMarks() > s1.getMarks()) {
			
			return 1;
			
		}else if(getMarks() < s1.getMarks()) {
			
			return -1;
			
		}else {
			
			return 0;
			
		}
	}

	
	
}
