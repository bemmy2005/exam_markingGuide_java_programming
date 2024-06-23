package Question2;

public class Student {
	String id;
	String name;
	char grade;
	int feesPaid=0;
	int feesTotal=30000;
	public Student(String id, String name, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
		// TODO Auto-generated constructor stub
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public int getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid() {
		this.feesPaid = 0;
	}
	public int getFeesTotal() {
		return feesTotal;
	}
	public void setFeesTotal() {
		this.feesTotal = 30000;
	}
	

}
