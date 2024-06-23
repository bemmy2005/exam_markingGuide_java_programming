package Question2;

import java.util.ArrayList;
import java.util.List;

public class totalMoney {

	
	public static void main(String[] args) {
		
		
		
Teacher teacher1=new Teacher(1,"Alice",5000);
Teacher teacher2=new Teacher(2,"Bob",7000);
Student student1=new Student(1,"Charlie",4);
Student student2=new Student(2,"David",12);

List<Teacher>teacherList=new ArrayList<>();
teacherList.add(teacher1);
teacherList.add(teacher1);

List<Student>StudentList=new ArrayList<>();
StudentList.add(student1);
StudentList.add(student2);

School School=new School(teacherList,StudentList);
student1.payfees(5000);
student1.payfees(6000);
teacher1.Receivesalary(teacher1.getSalary());
teacher2.Receivesalary(teacher2.getSalary());
System.out.println("Total Money earned by School:"+School.getTotalMoneyEarned());
System.out.println("Total Money Spent by School:"+School.getTotalMoneySpent());


	}

}
