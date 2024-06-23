//Pascaline Shimwa 2305000057
package question2;

import java.util.ArrayList;
import java.util.List;

public class TestSchool {

	
	public static void main(String[] args) {
		Teacher Alice=new Teacher(1,"Alice",5000);
		Teacher Bob=new Teacher(2,"Bob",7000);
		
		//add a teacher to the list of teacher 
		List<Teacher>teacherList=new ArrayList<>();
		teacherList.add(Alice);
		teacherList.add(Bob);
		
		//create  instance of object student
		Student Charlie=new Student(1,"Charlie",4);
		Student David=new Student(2,"David",12);
		

		// add a student to the list of student 
		List<Student>studentList=new ArrayList<>();
		studentList.add(Charlie);
		studentList.add(David);
		
		
		//create an instance of school object
		School ghs= new School(teacherList,studentList);
		Charlie.payFees(5000);
		David.payFees(6000);
		
		System.out.println("GHS has earned $"+ School.getTotalMoneyEarned());
		Alice.receiveSalary(Alice.getSalary());
		System.out.println("GHS has Spent for salary to  "+Alice.getName()+" and now Alice has $"+ Alice.getSalary());
		Bob.receiveSalary(Bob.getSalary());
		System.out.println("GHS has Spent for salary to  "+Bob.getName()+" and now BOb has $"+ Bob.getSalary());
		System.out.println("Total money spent by the school: $"+School.getTotalMoneySpent()) ;   
		System.out.println("School balance after paying Salaries: $"+School.getBalance());
	}

}
