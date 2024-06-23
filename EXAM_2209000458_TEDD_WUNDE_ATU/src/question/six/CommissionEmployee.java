//TEDD WUNDE ATU 2209000458
package question.six;


public class CommissionEmployee extends Employee{
	double Gross_Sales;
	double Commission_rate;
	
	//constructor
   CommissionEmployee(double Gross_Sales, double Commission_rate) {
		this.Gross_Sales = Gross_Sales;
		this.Commission_rate = Commission_rate;
	}
	
	//only setters
	public void setGross_Sales(double gross_Sales) {
		Gross_Sales = gross_Sales;
	}
	public void setCommission_rate(double commission_rate) {
		Commission_rate = commission_rate;
	}
	
	double Earning() {
		
		return Gross_Sales*Commission_rate;
	}
	public void DisplayAllDetails() {
		System.out.println("Name: " + getName());
	    System.out.println("SSN: " + getSSN());
	    System.out.println("CompanyName: " + CompanyName);
	    System.out.println("Fax: " + Fax);
        System.out.println("Gross Sales: " + Gross_Sales);
        System.out.println("Commission Rate: " + Commission_rate);
    }
	

}
