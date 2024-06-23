package questiontwo;

import java.util.ArrayList;

import questinthree.Teacher;

public class Main {
	public static void main (String[]args){
		//Teacher
		Teachers alice=new  Teachers (1,"alice",5000);
		Teachers Bob=new Teachers(2,"Bob",7000);
		
		//add a teacher to the list of teachers
		ArrayList<Teachers>teacherlist=new   ArrayList<Teachers>();
		teacherlist.add(alice);
		teacherlist.add(Bob);
	
		
		// create  instance of object Student
		Student Charlie=new Student(1,"Chalie",4);
		Student David=new Student(2,"David",12);
		
		//add student to the list Students
		ArrayList<Student>StudentList=new ArrayList<Student>();
		StudentList.add(Charlie);
		StudentList.add(David);

		// create an instance of school object
		School bt=new School(teacherlist,StudentList);
		Charlie.payfees(5000);
		David.payfees(7000);
		System.out.println("bt has earned $"+School.getTotalmoneyErned());
		//pay teachers
		alice.receivesalary(alice.getSalary1());
		System.out .println(" bt has spent for salary to" +alice.getName()+"and now has $"+alice.getSalaryEarned());
		
		Bob.receivesalary(Bob.getSalaryEarned());
		System.out .println("bt has spent for salary to" +Bob.getName()+"and now has $"+Bob.getSalaryEarned());
		
		System.out .println("bt has spent $"+School.getTotalmoneyspent());
		alice.receivesalary(alice.getSalary1());
		System.out .println("bt has spent $"+School.getTotalmoneyspent());
		
		
		}
	}



