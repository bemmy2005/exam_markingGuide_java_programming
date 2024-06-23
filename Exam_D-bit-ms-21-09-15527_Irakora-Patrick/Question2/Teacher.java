package Question2;

public class Teacher {

	int id;
	String name;
	int salary;
	int salaryearned;
	


	

	public Teacher(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalaryearned() {
		return salaryearned;
	}

	public void setSalaryearned(int salaryearned) {
		this.salaryearned = salaryearned;
	}
	public int Receivesalary(int salary) {
		return 0;
	}

	public String toString() {
		return "Teacher [salary=" + salary + ", salaryearned=" + salaryearned
				+ ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getSalary()=" + getSalary() + ", getSalaryearned()="
	            + getSalaryearned() + "]";
	}
}
