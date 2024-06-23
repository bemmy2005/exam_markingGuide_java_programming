package question2;
/*Arsene MUGISHA
 * REG: 2305001063
 */
public class Teacher {
	private int id;
	private String name;
	private int money;
	private int moneyEarned;
	public Teacher(int id, String name, int money) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
		this.moneyEarned=0;
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
		return money;
	}
	public void setSalary(int money) {
		this.money = money;
	}
	public int getSalaryEarned() {
		return moneyEarned;
	}
	public void setSalaryEarned(int moneyEarned) {
		this.moneyEarned = moneyEarned;
	}
	public void receiveSalary(int money){
		this.moneyEarned+=money;
		School.updateTotalMoneySpent(money);
	}

}
