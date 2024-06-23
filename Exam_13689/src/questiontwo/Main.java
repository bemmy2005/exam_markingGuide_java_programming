package questiontwo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Teacher teacher1=new Teacher(1,"shema",10000);
		Teacher teacher2=new Teacher(2,"hakiza",20000);
		Student student1=new Student(1,"cedrick",3);
		Student student2=new Student(2,"blaise",2);
		List<Teacher>teacherList=new ArrayList<>();
		teacherList.add(teacher1);
		teacherList.add(teacher2);
		List<Student>studentList=new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		School school=new School(teacherList,studentList);
		student1.payFees(5000);
		student2.payFees(6000);
		teacher1.receivedSalary(teacher1.getSalary());
		teacher2.receivedSalary(teacher1.getSalary());
		
		System.out.println("Total money earned by school:"+school.getTotalMoneyEarned());
		System.out.println("Total money spent by school:"+school.getTotalMoneySpent());
	}

}
