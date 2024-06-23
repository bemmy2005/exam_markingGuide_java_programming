package question.two;

import java.util.ArrayList;
import java.util.List;

public class MainSchool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//teacher instance
		Teacher teacher1 = new Teacher(1, "Alice",  5000);
		Teacher teacher2 = new Teacher(2, "Bob",  7000);
		
		//student instance
		Student student1 = new Student(1, "Charlie", 4);
		Student student2 = new Student(2, "David", 12);
		
		ArrayList<Teacher> teacherList = new ArrayList<>();
		teacherList.add(teacher1);
		teacherList.add(teacher2);
		
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		
		School school = new School(teacherList, studentList);
		student1.payFees(5000);
		student1.payFees(5000);
		
		teacher1.recieveSalary(teacher1.getSalary());
		teacher2.recieveSalary(teacher2.getSalary());
		
		System.out.println("Total money earned by school: "+ school.getTotalMoneyEarned());
		System.out.println("Total money spent by school: "+ school.getTotalMoneySpent());
		
		

	}

}
