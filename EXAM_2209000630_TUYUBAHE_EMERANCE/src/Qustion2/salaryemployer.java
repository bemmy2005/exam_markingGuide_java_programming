package Qustion2;

public class salaryemployer {


	 public class SalariedEmployee extends Employee {
	     private double salary;
	     private double bonus;
	     private double deductions;

	     public void setSalary(double salary) {
	         this.salary = salary;
	     }

	     public void setBonus(double bonus) {
	         this.bonus = bonus;
	     }

	     public void setDeductions(double deductions) {
	         this.deductions = deductions;
	     }

	     @Override
	     public double earning() {
	         return salary + bonus - deductions;
	     }
	 }

}
