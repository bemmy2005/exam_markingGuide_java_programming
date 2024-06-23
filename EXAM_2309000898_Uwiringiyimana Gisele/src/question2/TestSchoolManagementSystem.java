package question2;


import java.util.ArrayList;
import java.util.List;

public class TestSchoolManagementSystem {
	public static void main(String[] args) {
	Teacher teacher1=new Teacher(1,"Alice",5000);
	Teacher teacher2=new Teacher(2,"Bob",7000);
	Student Student1=new Student(1,"Charlie",4);
	Student Student2=new Student(2,"David",12);
	List<Teacher>teacherList=new ArrayList<>();
	teacherList.add(teacher1);
	teacherList.add(teacher2);
	List<Student>StudentList=new ArrayList<>();
	StudentList.add(Student1);
	StudentList.add(Student2);
	School school=new School(teacherList,StudentList);
	 Student1.Feespay();
	Student2.FeesTotal(30000);
	teacher1.receiveSalary(teacher1.getSalary());
	teacher2.receiveSalary(teacher2.getSalary());
	System.out.println("Total money earned by school:"+school.getTotalMoneyEarned());
	System.out.println("total money spent by school:"+school.getTotalMoneySpent());
	

	}

}
