package QUESTION_2;



public class teacher {
	
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	public teacher(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned=0;
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
	
	public void setSalaryEarned(int salaryEarned) {
		this.salaryEarned = salaryEarned;
	}
	public void receiveSalary(int salary){
		this.salaryEarned+=salary;
		school.updateTotalMoneySpent(salary);
	}


}
