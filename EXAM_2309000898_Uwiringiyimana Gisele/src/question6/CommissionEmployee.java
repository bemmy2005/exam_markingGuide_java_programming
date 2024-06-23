package question6;

public abstract class CommissionEmployee extends Employee {
	    private double grossSales;
	    private double commissionRate;

	    public CommissionEmployee(String name, int ssn, String address, double grossSales, double commissionRate) {
	        super(name, ssn, address);
	        this.grossSales = grossSales;
	        this.commissionRate = commissionRate;
	    }

	    public void setGrossSales(double grossSales) {
	        this.grossSales = grossSales;
	    }

	    public void setCommissionRate(double commissionRate) {
	        this.commissionRate = commissionRate;
	    }

		

	  

}
