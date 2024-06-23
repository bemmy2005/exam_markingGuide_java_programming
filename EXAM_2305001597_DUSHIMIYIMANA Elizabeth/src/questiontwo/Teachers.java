package questiontwo;

public class Teachers {
	private int id;
	private String name;
	private int grade;
	private int Salary;
	private int SalaryEarned;
	public Teachers(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.Salary = salary;
		this.SalaryEarned=0;
		
	
		this.name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary() {
		int receivesalary = 0;
		this.Salary = receivesalary;
	}
	public int getSalaryEarned() {
		return SalaryEarned;
	}
	public void setSalaryEarned(int salaryEarned) {
		this.SalaryEarned = salaryEarned;
	}

	public void receivesalary(int salary){
this.SalaryEarned+=salary;
School.setTotalmoneyspent(salary);
		
	}private int feespaid;
	private int feesTotal;
	private int balance;
	public void Teacher(int id, String name, int grade) {
		
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feespaid=0;
		this.feesTotal=30000;
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
	public int getFeespaid() {
		return feespaid;
	}
	public void setFeespaid(int feespaid) {
		this.feespaid = feespaid;
	}
	public int getFeesTotal() {
		return feesTotal;
	}
	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance() {
		this.balance = this.feesTotal-this.feespaid;
	}
	
public void payfees(int fees){
	feespaid+=fees;
School.updateTotalMoneyEarned(fees);}


public int getSalary1() {
	// TODO Auto-generated method stub
	return 0;
}
}



