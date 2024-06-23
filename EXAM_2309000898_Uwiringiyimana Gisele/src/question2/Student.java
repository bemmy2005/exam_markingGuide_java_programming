package question2;

public class Student {
	int id;
	String name;
	int grade;
	private int feespaid;
	private int feestotal;
	private int PayFees;
	public Student(int id, String name, int grade,int feespaid,int feestotal) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feespaid=feespaid;
		this.feestotal=feestotal;
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
		PayFees=feestotal-feespaid;
	}
}
