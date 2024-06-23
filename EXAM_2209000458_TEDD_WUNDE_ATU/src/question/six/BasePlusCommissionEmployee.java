//TEDD WUNDE ATU 2209000458
package question.six;


public class BasePlusCommissionEmployee extends CommissionEmployee{
	BasePlusCommissionEmployee(double Gross_Sales, double Commission_rate) {
		super(Gross_Sales, Commission_rate);
	}

	double base;
	//setters

	public void setBase(double base) {
		this.base = base;
	}
	
	double Earning(){
		
		return base+(Gross_Sales*Commission_rate);
	}
	public void DisplayAllDetails() {
		System.out.println("Name: " + getName());
	    System.out.println("SSN: " + getSSN());
	    System.out.println("CompanyName: " + CompanyName);
	    System.out.println("Fax: " + Fax);
        System.out.println("Base Salary: " + base);
    }

}
