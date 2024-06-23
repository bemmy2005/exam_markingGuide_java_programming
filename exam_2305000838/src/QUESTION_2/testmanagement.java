package QUESTION_2;

import java.util.ArrayList;



public class testmanagement {
	public static void main(String[] args) {
		
			// Teachers
			// create instance of object teacher
			teacher alice = new teacher(1,"alice", 5000);
			teacher bob = new teacher(2,"bob", 7000);
			
			// add a student to the list of students
			
			ArrayList<teacher> teacherList = new ArrayList<>();
			teacherList.add(alice);
			teacherList.add(bob);
			
			// create instance of object student
			
			student charlie = new student (1, "charlie", 4);
			student david = new student (2, "david", 12);
			
			// add a student to the list of students
			
			ArrayList<student> studentList= new ArrayList<>();
			studentList.add(charlie);
			studentList.add(david);
			
			// create an instance of school object
			
			school sc1 = new school(teacherList, studentList);
			charlie.payFees(5000);
			david.payFees(7000);
			
			System.out.println("sc1 Has earned "+school.getTotalMoneyEarned()+"$");
			//pay teachers
			alice.receiveSalary(alice.getSalary());
			System.out.println("sc1 has spent for salary to " + alice.getName()+" and now has "+ alice.getSalary()+"$");
			bob.receiveSalary(bob.getSalary());
			System.out.println("sc1 has spent for salary to " + bob.getName()+" and now has "+ bob.getSalary()+"$");
			System.out.println("sc1 Has spent "+school.getTotalMoneySpent()+"$");
			
			
		}

}
