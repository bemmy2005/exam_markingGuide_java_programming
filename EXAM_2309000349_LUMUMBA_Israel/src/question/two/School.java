package question.two;

import java.awt.List;
import java.util.ArrayList;



public class School {
private ArrayList<Student>student;
private ArrayList<Teacher>teacher;
private  double totalMoneyEarned;
private  double MoneySpent;
//constructor
public School(ArrayList<Student> student, ArrayList<Teacher> teacher,
		double totalMoneyEarned, double moneySpent) {
	super();
	this.student = student;
	this.teacher = teacher;
	this.totalMoneyEarned = totalMoneyEarned;
	MoneySpent = moneySpent;
}
//setters and getters
public ArrayList<Student> getStudent() {
	return student;
}
public void setStudent(ArrayList<Student> student) {
	this.student = student;
}
public ArrayList<Teacher> getTeacher() {
	return teacher;
}
public void setTeacher(ArrayList<Teacher> teacher) {
	this.teacher = teacher;
}
public double getTotalMoneyEarned() {
	return totalMoneyEarned;
}
public void setTotalMoneyEarned(double totalMoneyEarned) {
	this.totalMoneyEarned = totalMoneyEarned;
}
public double getMoneySpent() {
	return MoneySpent;
}
public void setMoneySpent(double moneySpent) {
	MoneySpent = moneySpent;
}
//method 
double addTeacher(){
	return MoneySpent;
	
}
//method
double addStudent(){
	return totalMoneyEarned;
}
//update TotalMoneySpent

//update TotalMoneyEarned
}


