package question_two;
//your reg number is wrong 2305001214, but on this project it is 2305001212
public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int earnedsalary;
	public Teacher(int id, String name, int salary, int earnedsalary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.earnedsalary = earnedsalary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEarnedsalary() {
		return earnedsalary;
	}
	public void setEarnedsalary(int earnedsalary) {
		this.earnedsalary = earnedsalary;
	}
	

}
