package Question2;

import java.awt.List;

public class Teacher {
	private list<teacher>teacher;
	private list<student>student;
	int totalMoneyEarned=0;
	int totalMoneySpent=0;
	public Teacher(list<Question2.teacher> teacher,
			List<Question2.student> student) {
		super();
		this.teacher = teacher;
		this.student = student;
	}
	public list<teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(list<teacher> teacher) {
		this.teacher = teacher;
	}
	public list<student> getStudent() {
		return student;
	}
	public void setStudent(list<student> student) {
		this.student = student;
	}
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	public void setTotalMoneyEarned() {
		this.totalMoneyEarned = 0;
	}
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	public void setTotalMoneySpent() {
		this.totalMoneySpent = 0;
	}
	
}
