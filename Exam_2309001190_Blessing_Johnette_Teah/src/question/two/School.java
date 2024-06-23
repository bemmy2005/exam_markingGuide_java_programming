package question.two;

import java.util.ArrayList;

public class School {
	
	ArrayList<Teacher> teachers=new ArrayList<Teacher>();
	ArrayList<Student> students=new ArrayList<Student>();
	private int totalMoneyEarned;
	private int totalMoneySpent;
	
	
	//constructors
	public School(ArrayList<Teacher> teachers, ArrayList<Student> students
			) {
		super();
		this.teachers = teachers;
		this.students = students;
		this.totalMoneyEarned = 0;
		this.totalMoneySpent = 0;
	}


	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}


	public void setTeachers(ArrayList<Teacher> teachers) {
		this.teachers = teachers;
	}


	public ArrayList<Student> getStudents() {
		return students;
	}


	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}


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
	//method
	public void addTeacher(Teacher teacher)
	{
		teachers.add(teacher);
	}
	//method
	public void addStudent(Student student)
	{
		students.add(student);
	}
	
	// 
	public void updateTotalMoneyEarned(int money)
	{
		this.totalMoneyEarned += money;
	}
	
	public void updateTotalMoneySpent(int money)
	{
		this.totalMoneySpent -= money;
	}


}
