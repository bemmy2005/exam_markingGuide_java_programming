//Nyirabaziga ituze merveille 
//2301000975


package Questiontwo;
import java.util.ArrayList;
public class School {
private ArrayList<Teacher>teacher;
private ArrayList<Student>student;
private static int totalMoneyEarned;
private static int totalMoneySpent;
public School(ArrayList<Teacher> teacher, ArrayList<Student> student) {
	super();
	this.teacher = teacher;
	this.student = student;
	totalMoneyEarned=0;
	totalMoneySpent=0;
	
}
public ArrayList<Teacher> getTeacher() {
	return teacher;
}
public void setTeacher(ArrayList<Teacher> teacher) {
	this.teacher = teacher;
}
public ArrayList<Student> getStudent() {
	return student;
}
public void setStudent(ArrayList<Student> student) {
	this.student = student;
}
//add element to the list
public void addTeacher(Teacher teacher){
	this.teacher.add(teacher);
	
}

public void addStudent(Student student){
	this.student.add(student);
}
//update
public static void updateTotalMoneyEarned(int salaryEarned) {
	totalMoneyEarned += salaryEarned;
}
	public static void updateTotalMoneySpent(int moneySpent){
totalMoneySpent +=moneySpent;
	}
	public static int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	public static void setTotalMoneyEarned(int totalMoneyEarned) {
		School.totalMoneyEarned = totalMoneyEarned;
	}
	public static int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	public static void setTotalMoneySpent(int totalMoneySpent) {
		School.totalMoneySpent = totalMoneySpent;
	}
	
	
}

