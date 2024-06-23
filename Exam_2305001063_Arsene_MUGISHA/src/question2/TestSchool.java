package question2;
/*Arsene MUGISHA
 * REG: 2305001063
 */
import java.util.ArrayList;
import java.util.List;

import question2.School;
import question2.Student;
import question2.Teacher;


public class TestSchool {

	
	public static void main(String[] args) {
		// Teachers
		// create instance of object teacher
		Teacher Alice= new Teacher(1,"Alice", 5000);
		Teacher Bob = new Teacher(2,"Bob", 7000);
		
		// add a student to the list of students
		
		ArrayList<Teacher> teacherList = new ArrayList<>();
		teacherList.add(Alice);
		teacherList.add(Bob);
		
		// create instance of object student
		
		Student Charlie = new Student (1, "Charlie", 4);
		Student David = new Student (2, "David", 12);
		
		// add a student to the list of students
		
		ArrayList<Student> studentList= new ArrayList<>();
		studentList.add(Charlie);
		studentList.add(David);
		
		// create an instance of school object
		
		School janja = new School(teacherList, studentList);
		Charlie.payFees(7000);
		David.payFees(8000);
		
		System.out.println("Janja Has earned "+School.getTotalMoneyEarned()+"$");
		//pay teachers
		Alice.receiveSalary(Alice.getSalary());
		System.out.println("Janja has spent for salary to "+Alice.getName()+", and now has "+Alice.getSalary()+"$");
		Bob.receiveSalary(Bob.getSalary());
		System.out.println("Janja has spent for salary to "+Bob.getName()+", and now has "+Bob.getSalary()+"$");
		System.out.println("Janja Has spent "+School.getTotalMoneySpent()+"$");
	
	}

}
