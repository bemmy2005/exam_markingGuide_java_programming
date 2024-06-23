package Question2;

public class Student {

	int id;
	String name;
	String grade;
	int feespaid=0;
	int feesTotal=30000;
	
	public Student(int id, String name, String grade, int feespaid,
			int feesTotal) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feespaid = feespaid;
		this.feesTotal = feesTotal;
	}

	public Student(int i, String string, int j) {
		// TODO Auto-generated constructor stub
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getFeespaid() {
		return feespaid;
	}

	public void setfeespaid() {
		this.feespaid =30000;
	}

	public int getFeesTotal() {
		return feesTotal;
	}

	public void setFeesTotal(int feesTotal) {
	this.feesTotal = feesTotal;
	}
	public int payfees(int amount) {
		return 0;
	}
	public String toString() {
		return "Student [feespaid=" + feespaid + ", feesTotal=" + feesTotal
				+ "]";
	}
}