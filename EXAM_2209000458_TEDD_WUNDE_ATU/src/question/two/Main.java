//TEDD WUNDE ATU 2209000458
package question.two;
import java.util.ArrayList;
import java.util.List;

import question.two.School;
import question.two.Student;
import question.two.Teacher;

public class Main {

		public static void main(String[] args) {
			Teacher teacher1=new Teacher(1, "Alice", 5000);
			Teacher teacher2=new Teacher(2, "Bob", 7000);
			List<Teacher> teacherList=new ArrayList<>();
			teacherList.add(teacher1);
			teacherList.add(teacher2);
			
			Student student1=new Student(1, "Charlie",4);
			Student student2=new Student(2, "David",12); 
			List<Student> studentList=new ArrayList<>();
			studentList.add(student1);
			studentList.add(student2);
	
			School school=new School(teacherList,studentList);
			student1.payFees(5000);
			student2.payFees(6000);
			teacher1.receiveSalary(teacher1.getSalary());
			teacher2.receiveSalary(teacher2.getSalary());
			System.out.println("Total money earned by School: "+school.getTotalMoneyEarned());
			System.out.println("Total money spent by school: "+school.getTotalMoneySpent());
			
			
	}


}
