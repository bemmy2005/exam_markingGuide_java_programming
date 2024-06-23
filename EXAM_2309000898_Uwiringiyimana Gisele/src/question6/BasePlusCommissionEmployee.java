package question6;
	public class BasePlusCommissionEmployee extends CommissionEmployee {
	    private double baseSalary;

	    public BasePlusCommissionEmployee(String name, int ssn, String address, double grossSales, double commissionRate, double baseSalary) {
	        super(name, ssn, address, grossSales, commissionRate);
	        this.baseSalary = baseSalary;
	    }

	    public void setBaseSalary(double baseSalary) {
	        this.baseSalary = baseSalary;
	    }

}
