package question2;

import java.util.ArrayList;
import java.util.List;

public class School {
	private ArrayList<Teacher>teachers;
	private ArrayList<Student>students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	public School(List<Teacher> teacherList, List<Student> studentList) {
		super();
		this.teachers = teacherList;
		this.students = studentList;
		totalMoneyEarned = 0;
		totalMoneySpent=0;
		
	}
//getter and setter
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
	public void addTeacher(Teacher teacher){
		this.teachers.add(teacher);
	}
	public void addStudent(Student student){
		this.students.add(student);
	}
	//update
	public static void updateTotalMoneySpent(int moneySpent){
		totalMoneySpent+=moneySpent;
	}
	//getters
	public static int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	public static int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	}

