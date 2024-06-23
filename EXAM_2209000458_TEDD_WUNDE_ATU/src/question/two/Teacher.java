//TEDD WUNDE ATU 2209000458
package question.two;


public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	//constructor
	public Teacher(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned=0;
	}
	//getters and setters
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
	public int getSalaryEarned() {
		return salaryEarned;
	}
	public void setSalaryEarned(int salaryEarned) {
		this.salaryEarned = salaryEarned;
	}
	//method for receiving salary 
	public void receiveSalary(int salary){
		this.salaryEarned+=salary;
	School.updateTotalMoneySpent(salary);
	}
	
	

}
