package QuestionTwo;

//These codes are not yours

public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	private int balance;
	
	public Student(int id, String name, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid=0;
		this.feesTotal=125000;
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
		return feesPaid;
	}

	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
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

	public void setBalance(int balance) {
		this.balance = this.feesTotal-this.feesPaid;
	}

	public void payFees(int fees){
		feesPaid+=fees;
		School.updateTotalMoneyEarned(fees);
	}
}

	