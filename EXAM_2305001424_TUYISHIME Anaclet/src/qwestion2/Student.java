package qwestion2;

import java.util.ArrayList;
import java.util.List;

public class Student {

	
	public static void main(String[] args) {
		Teacher lizzy=new Teacher(1,"Lizzy",500);
		Teacher melissa=new Teacher(2,"Melissa",700);
		Teacher vanderhorn=new Teacher(3,"Vanderhorn",600);
		//add a teacher to the list of teacher 
		List<Teacher>teacherList=new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(melissa);
		teacherList.add(vanderhorn);
		//create  instance of object student
		Student tamasha=new Student();
		Student rakshith=new Student();
		Student rabbi=new Student();

		// add a student to the list of student 
		List<Student>studentList=new ArrayList<>();
		studentList.add(tamasha);
		studentList.add(rakshith);
		studentList.add(rabbi);
		
		//create an instance of school object
		School ghs= new School(teacherList,studentList);
		tamasha.payFees(5000);
		rakshith.payFees(6000);
		
		System.out.println("GHS has earned $"+ School.getTotalMoneyEarned());
		lizzy.receiveSalary(lizzy.getSalary());
		System.out.println("GHS has Spent for salary to  "+lizzy.getName()+" and now has $"+ lizzy.getSalary());
		melissa.receiveSalary(melissa.getSalary());
		System.out.println("GHS has Spent for salary to  "+melissa.getName()+" and now has $"+ melissa.getSalary());
		System.out.println("Total money spent by the school: $"+School.getTotalMoneySpent()) ;   
		System.out.println("School balance after paying Salaries: $"+School.getBalance());
	}

}
