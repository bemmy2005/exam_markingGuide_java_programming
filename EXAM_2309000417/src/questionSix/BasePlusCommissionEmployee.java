package questionSix;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;

	public BasePlusCommissionEmployee(String name, int socialSecurityNumber, String address,
			double grossSales, double commissionRate, double baseSalary) {
		super(name, socialSecurityNumber, address, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	@Override
	public double calculateEarnings() {
		return super.calculateEarnings() + baseSalary;
	}

	public double getBaseSalary() {
		return 20000.0;
	}
}