package Question_two;

public class Main {
	
	    public static void main(String[] args) {
	        Teacher peter = new Teacher(1, "peter", 500);
	        Teacher james = new Teacher(2, "james", 700);
	        Teacher luka = new Teacher(3, "luka", 600);

	        Student achol = new Student(1, "achol", 4, 5000);
	        Student deng = new Student(2, "deng", 12, 6000);
	        Student chol = new Student(3, "chol", 5, 4500);

	        School ghs = new School();

	        ghs.addTeacher(peter);
	        ghs.addTeacher(james);
	        ghs.addTeacher(luka);

	        ghs.addStudent(achol);
	        ghs.addStudent(deng);
	        ghs.addStudent(chol);

	        achol.payFees(5000);
	        deng.payFees(6000);

	        peter.receiveSalary(peter.getSalary());
	        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());
	        System.out.println("GHS has spent for salary to " + peter.getName() + " and now has $" + 
	        ghs.getTotalMoneySpent());

	        james.receiveSalary(james.getSalary());
	        System.out.println("GHS has spent for salary to " + james.getName() + " and now has $" + 
	        ghs.getTotalMoneySpent());
	    }
	}

//Butrus_wol
//2309000416

