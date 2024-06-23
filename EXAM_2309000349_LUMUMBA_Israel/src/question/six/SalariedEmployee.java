package question.six;

public class SalariedEmployee {
private double salary;
private double bonus;
private double deduction;
//setters
public void setSalary(double salary) {
	this.salary = salary;
}
public void setBonus(double bonus) {
	this.bonus = bonus;
}
public void setDeduction(double deduction) {
	this.deduction = deduction;
}
//method
double Earning(){
	return salary+bonus-deduction;
}
public void DisplayAllDetails(){
	System.out.println("salary "+salary);
	System.out.println("bonus "+bonus);
	System.out.println("deduction "+deduction);
	
}
}
