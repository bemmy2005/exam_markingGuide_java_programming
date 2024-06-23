package questiontwo;

import java.util.ArrayList;

public class TestMis {
    public static void main(String[] args) {
        // Create teacher instances
        Teacher alice = new Teacher(1, "Alice", 5000);
        Teacher bob = new Teacher(2, "Bob", 7000);

        // Add teachers to a list
        ArrayList<Teacher> teacherList = new ArrayList<>();
        teacherList.add(alice);
        teacherList.add(bob);

        // Create student instances with updated names and grades
        Student charlie = new Student(1, "Charlie", 4);
        Student david = new Student(2, "David", 12);

        // Add students to a list
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(charlie);
        studentList.add(david);

        // Create school instance with the list of teachers and students
        School ghs = new School(teacherList, studentList);

        // Display total money earned by the school initially
        System.out.println("GHS has earned $" + School.getTotalMoneyEarned());

        // Students pay fees
        charlie.payFees(5000);
        System.out.println("GHS has earned $" + School.getTotalMoneyEarned());

        david.payFees(6000);
        System.out.println("GHS has earned $" + School.getTotalMoneyEarned());

        // Display message about paying teacher salaries
        System.out.println("------ Making SCHOOL PAY SALARY ------");

        // Update and pay salaries to teachers
        School.updateTotalMoneySpent(alice.getSalary());
        System.out.println("GHS has spent for salary to " + alice.getName() + " and now has $" + (School.getTotalMoneyEarned() - School.getTotalMoneySpent()) + " remaining.");

        int remainingMoneyBob = School.getTotalMoneyEarned() - School.getTotalMoneySpent() - bob.getSalary();
        System.out.println("GHS has spent for salary to " + bob.getName() + " and now has $" + (remainingMoneyBob >= 0 ? remainingMoneyBob : "Negative balance: $" + remainingMoneyBob) + " remaining.");

        // Display total money earned and spent by the school
        System.out.println("Total money earned by the school: $" + School.getTotalMoneyEarned());
        System.out.println("Total money spent by the school: $" + School.getTotalMoneySpent());
    }
}
