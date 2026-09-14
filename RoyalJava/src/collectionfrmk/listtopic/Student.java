package collectionfrmk.listtopic;

public class Student {

	private int id;
	private int std;
	private float marks;
	private String name;
	
	public Student(int id, int std, float marks, String name) {
		super();
		this.id = id;
		this.std = std;
		this.marks = marks;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	@Override
//	public String toString() {
//	
//		return super.toString();
//	
//	}
		
	
}
