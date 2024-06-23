package question2;
/*Arsene MUGISHA
 * REG: 2305001063
 */
public class Student {
	
	private int id;
	private String name;
	private int grade;
	private int moneyPaid;
	private int moneyTotal;
	private int balance;
	public Student(int id, String name, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.moneyPaid=0;
		this.moneyTotal=30000;
		this.balance=0;
		
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getFeesPaid() {
		return moneyPaid;
	}
	public void setFeesPaid(int moneyPaid) {
		this.moneyPaid = moneyPaid;
	}
	public int getFeesTotal() {
		return moneyTotal;
	}
	public void setFeesTotal(int moneyTotal) {
		this.moneyTotal = moneyTotal;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance() {
		this.balance = this.moneyTotal-this.moneyPaid;
	}
	public void payFees(int money){
		this.moneyPaid+=money;
		School.updateTotalMoneyEarned(money);
	}
	
}
