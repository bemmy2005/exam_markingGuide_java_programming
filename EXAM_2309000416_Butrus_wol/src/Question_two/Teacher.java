package Question_two;

public class Teacher {
	
	    private int id;
	    private String name;
	    private int salary;
	    private int salaryEarned;

	    public Teacher(int id, String name, int salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	        this.salaryEarned = 0;
	    }

	    public void setSalary(int salary) {
	        this.salary = salary;
	    }

	    public void receiveSalary(int salary) {
	        salaryEarned += salary;
	        School.updateTotalMoneySpent(salaryEarned);
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getSalary() {
	        return salary;
	    }

	    public int getSalaryEarned() {
	        return salaryEarned;
	    }

		public static void add(Teacher teacher) {
			// TODO Auto-generated method stub
			
		}
	}

//Butrus_wol
//2309000416

