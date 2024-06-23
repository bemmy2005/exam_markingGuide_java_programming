package question2;

public class Teacher extends Main {
private int id;
private String Name;
private int salary;
private int SalaryEarned;
public Teacher(int id, String Name, int salary) {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getSalaryEarned() {
	return SalaryEarned;
}
public void setSalaryEarned(int salaryEarned) {
	SalaryEarned = salaryEarned;
}
public void receiveSalary() {
	
}
public int getGrade() {
	return 0 ;
}
}
