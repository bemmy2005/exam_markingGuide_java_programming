package Question_two;

	import java.util.ArrayList;
	import java.util.List;

	public class Student {
	    private int id;
	    private String name;
	    private int grade;
	    private int feesPaid;
	    private int feesTotal;

	    public Student(int id, String name, int grade, int feesTotal) {
	        this.id = id;
	        this.name = name;
	        this.grade = grade;
	        this.feesPaid = 0;
	        this.feesTotal = feesTotal;
	    }

	    public void setGrade(int grade) {
	        this.grade = grade;
	    }

	    public void payFees(int fees) {
	        feesPaid += fees;
	        School.updateTotalMoneyEarned(feesPaid);
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getGrade() {
	        return grade;
	    }

	    public int getFeesPaid() {
	        return feesPaid;
	    }

	    public int getFeesTotal() {
	        return feesTotal;
	    }

		public static void add(Student student) {
			// TODO Auto-generated method stub
			
		}
	}

//Butrus_wol
	//2309000416
