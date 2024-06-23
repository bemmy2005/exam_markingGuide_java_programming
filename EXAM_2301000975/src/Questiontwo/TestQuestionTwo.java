//Nyirabaziga ituze merveille 
//2301000975


package Questiontwo;

import java.util.ArrayList;
import java.util.List;

public class TestQuestionTwo {

	
	public static void main(String[] args) {
		//teacher
		Teacher Alice=new Teacher(1,"Alice",5000);
		Teacher Bob=new Teacher(2,"Bob",7000);
		
		//add a teacher to the list of teachers
		ArrayList<Teacher>teacherList=new ArrayList<>();
		teacherList.add(Alice);
		teacherList.add(Bob);
		
		//create instance of object 
		 Student Charlie=new Student(1,"Charlie",4);
		 Student David=new  Student(2,"David",12);
		 
		
		//add a  to the list of s
		ArrayList<Student>studentList=new ArrayList<>();
		studentList.add(Charlie);
		studentList.add(David);
		
		
		//create the instance of school object
		School ghs =new School(teacherList,studentList);
		Charlie.payFees(5000);
		David.payFees(7000);
		System.out.println("GHS has earned $"+School.getTotalMoneyEarned());
		//pay teacher
		Alice.receiveSalary(Alice.getSalary());
		System.out.println("GHS has spent for salary to"+Alice.getName()+"and now has $"+School.getTotalMoneyEarned());
		Bob.receiveSalary(Bob.getSalary());
		System.out.println("GHS has spent for salary to"+Bob.getName()+"and now has $"+School.getTotalMoneyEarned());
	}
	

}
