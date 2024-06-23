package question.two;

public class Teacher {
private int id;
private String Name;
private double salary;
private double salaryEarned;
//constructor
public Teacher(int id, String name) {
	super();
	this.id = id;
	Name = name;
	this.salary = 120;
	this.salaryEarned = 140;
}
//settes and getters
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
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public double getSalaryEarned() {
	return salaryEarned;
}
public void setSalaryEarned(double salaryEarned) {
	this.salaryEarned = salaryEarned;
}
//method
double receiveSalary(){
	return salaryEarned-salary;
}

}
