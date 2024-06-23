package Question2;

import java.util.List;

public class School {
int totalMoneyEarned;
int totalMoneySpent;
List<teachers>teacher;
List<students>student;
public int getTotalMoneyEarned() {
	return totalMoneyEarned;
}
public void setTotalMoneyEarned(int totalMoneyEarned) {
	this.totalMoneyEarned = totalMoneyEarned;
}
public int getTotalMoneySpent() {
	return totalMoneySpent;
}
public void setTotalMoneySpent(int totalMoneySpent) {
	this.totalMoneySpent = totalMoneySpent;
}
public List<teachers> getTeacher() {
	return teacher;
}
public void setTeacher(List<teachers> teacher) {
	this.teacher = teacher;
}
public List<students> getStudent() {
	return student;
}
public void setStudent(List<students> student) {
	this.student = student;
}
public School(int totalMoneyEarned, int totalMoneySpent,
		List<teachers> teacher, List<students> student) {
	super();
	this.totalMoneyEarned = totalMoneyEarned;
	this.totalMoneySpent = totalMoneySpent;
	this.teacher = teacher;
	this.student = student;
}

}
