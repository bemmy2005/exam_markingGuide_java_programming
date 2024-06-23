package questiontwo;

import java.util.ArrayList;

import questinthree.Teacher;

public class School {
		// TODO Auto-generated constructor stub
	
	private int TOtalMoneyEarned;
	private int TotalMoneySpent;
	private ArrayList<Teachers> teachers;
	private ArrayList<Student>students;
	private static int totalmoneyErned;
	private static int totalmoneyspent;
	public School(ArrayList<Teachers> teacherlist, ArrayList<Student> students) {
		super();
		this.teachers = teacherlist;
		this.students = students;
	}
	public ArrayList<Teacher> getTeachers() {
		return getTeachers();
	}
	public void setTeachers(ArrayList<Teachers> teachers) {
		this.teachers = teachers;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}//add element to the list
	public void addTeacher(Teachers teacher){
		this.teachers.add(teacher);
	}
	public void addStudent(Student student){
		this.students.add(student);
	}
	//update
	
	public static void updateTotalMoneyEarned(int MoneyEarned){
		totalmoneyErned+=MoneyEarned;
	}
	public static void updateTotalMoneySpent(int MoneySpent){
		totalmoneyspent+=MoneySpent;
	
}
	public static int getTotalmoneyErned() {
		return totalmoneyErned;
	}
	public static void setTotalmoneyErned(int totalmoneyErned) {
		School.totalmoneyErned = totalmoneyErned;
	}
	public static int getTotalmoneyspent() {
		return totalmoneyspent;
	}
	public static void setTotalmoneyspent(int totalmoneyspent) {
		School.totalmoneyspent = totalmoneyspent;
	}}


