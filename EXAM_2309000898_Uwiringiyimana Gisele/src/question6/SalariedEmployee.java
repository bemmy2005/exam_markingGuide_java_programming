package question6;
	 public class SalariedEmployee extends Employee {
	    private double salary;
	    private double bonus;
	    private double deduction;

	    public SalariedEmployee(String name, int ssn, String address, double salary, double bonus, double deduction) {
	        super(name, ssn, address);
	        this.salary = salary;
	        this.bonus = bonus;
	        this.deduction = deduction;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    public void setBonus(double bonus) {
	        this.bonus = bonus;
	    }

	    public void setDeduction(double deduction) {
	        this.deduction = deduction;
	    
	    public double earnings() {
	        return salary + bonus - deduction;
	    }

}
