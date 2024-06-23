//TEDD WUNDE ATU 2209000458
package question.six;


public class SalariedEmployee extends Employee {
	double salary;
	double Bonus;
	double Deductions;
	
	//constructor
	public SalariedEmployee(double salary, double bonus, double deductions) {
		this.salary = salary;
		Bonus = bonus;
		Deductions = deductions;
	}
	//setters
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setBonus(double bonus) {
		Bonus = bonus;
	}
	public void setDeductions(double deductions) {
		Deductions = deductions;
	}
	
	double Earning() {
		
		return salary+Bonus-Deductions;
	}
	public void DisplayAllDetails() {
        System.out.println("Name: " + getName());
        System.out.println("SSN: " + getSSN());
        System.out.println("CompanyName: " + CompanyName);
        System.out.println("Fax: " + Fax);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + Bonus);
        System.out.println("Deductions: " + Deductions);
   
    }

	
	

}
