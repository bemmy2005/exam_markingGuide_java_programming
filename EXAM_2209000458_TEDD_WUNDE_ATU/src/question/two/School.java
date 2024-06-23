//TEDD WUNDE ATU 2209000458
package question.two;

import java.util.ArrayList;
import java.util.List;

public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	//constructor
	public School(List<Teacher> teacherList, List<Student> studentList) {
		super();
		this.teachers = teacherList;
		this.students = studentList;
		totalMoneySpent=0;
		totalMoneyEarned=0;
	}
	//getters and setters for students and teachers
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(ArrayList<Teacher> teachers) {
		this.teachers = teachers;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	//method to help us add a teacher to the list of teachers created
	public void addTeacher (Teacher teacher){
		this.teachers.add(teacher);
	}
	//method to help us add a student to the list of students created
	public void addStudent (Student student){
		this.students.add(student);
	}
	
	public static void updateTotalMoneyEarned(int money){
		totalMoneyEarned+=money;
	
	}
	public static void updateTotalMoneySpent(int money){
		totalMoneySpent+=money;
	
	}
	//Getters for total money  earned and total money spent
	public static int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	public static int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	
	
	

}
