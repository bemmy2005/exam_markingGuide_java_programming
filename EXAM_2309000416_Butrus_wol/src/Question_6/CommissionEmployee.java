package Question_6;

	public class CommissionEmployee extends Employee {
	    private double grossSales;
	    private double commissionRate;

	    public CommissionEmployee(String name, int socialSecurityNumber, String address,
	                              double grossSales, double commissionRate) {
	        super(name, socialSecurityNumber, address);
	        this.grossSales = grossSales;
	        this.commissionRate = commissionRate;
	    }

	    @Override
	    public double calculateEarnings() {
	        return grossSales * commissionRate;
	    }

	    public double getGrossSales() {
	        return 100000.0;
	    }

	    public double getCommissionRate() {
	        return 0.1;
	    }
	}





