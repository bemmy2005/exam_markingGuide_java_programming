package QUESTION_2;

import java.util.ArrayList;


public class school {
	private ArrayList <teacher> teachers;
	private ArrayList <student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	public school(ArrayList<teacher> teachers, ArrayList<student> students) {
		super();
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned=0;
		totalMoneySpent=0;
	}
	public ArrayList<teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(ArrayList<teacher> teachers) {
		this.teachers = teachers;
	}
	public ArrayList<student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<student> students) {
		this.students = students;
	}
	public void addTeacher(teacher teacher){
		this.teachers.add(teacher);
	}
	public void addStudent(student student){
		this.students.add(student);
}
	public static void updateTotalMoneyEarned(int moneyEarned){
		totalMoneyEarned += moneyEarned;
	}
	public static void updateTotalMoneySpent(int moneySpent){
		totalMoneySpent += moneySpent;
	}
	public static int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	public static void setTotalMoneyEarned(int totalMoneyEarned) {
		school.totalMoneyEarned = totalMoneyEarned;
	}
	public static int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	public static void setTotalMoneySpent(int totalMoneySpent) {
		school.totalMoneySpent = totalMoneySpent;
	}
	

}
