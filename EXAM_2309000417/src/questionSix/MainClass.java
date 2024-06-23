package questionSix;

public class MainClass {
	public static void main(String[] args) {

		// Create instances of different employee types
		SalariedEmployee salariedEmployee = new SalariedEmployee("John", 12345, "123 Main St", 50000.0);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Alice", 67890, "456 Elm St", 20.0, 40);
		CommissionEmployee commissionEmployee = new CommissionEmployee("Bob", 54321, "789 Oak St", 100000.0, 0.1);
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
				"Eve", 98765, "321 Maple St", 80000.0, 0.12, 20000.0);

		// Display information for each employee
		System.out.println("Employee Information:");
		System.out.println("---------------------");
		System.out.println("Name: " + salariedEmployee.getName());
		System.out.println("SSN: " + salariedEmployee.getSocialSecurityNumber());
		System.out.println("Address: " + salariedEmployee.getAddress());
		System.out.println("Salary: $" + salariedEmployee.calculateEarnings());
		System.out.println();

		System.out.println("Name: " + hourlyEmployee.getName());
		System.out.println("SSN: " + hourlyEmployee.getSocialSecurityNumber());
		System.out.println("Address: " + hourlyEmployee.getAddress());
		System.out.println("Hourly Wage: $" + hourlyEmployee.getHourlyWage());
		System.out.println("Hours Worked: " + hourlyEmployee.getHoursWorked());
		System.out.println("Earnings: $" + hourlyEmployee.calculateEarnings());
		System.out.println();

		System.out.println("Name: " + commissionEmployee.getName());
		System.out.println("SSN: " + commissionEmployee.getSocialSecurityNumber());
		System.out.println("Address: " + commissionEmployee.getAddress());
		System.out.println("Gross Sales: $" + commissionEmployee.getGrossSales());
		System.out.println("Commission Rate: " + commissionEmployee.getCommissionRate());
		System.out.println("Earnings: $" + commissionEmployee.calculateEarnings());
		System.out.println();

		System.out.println("Name: " + basePlusCommissionEmployee.getName());
		System.out.println("SSN: " + basePlusCommissionEmployee.getSocialSecurityNumber());
		System.out.println("Address: " + basePlusCommissionEmployee.getAddress());
		System.out.println("Gross Sales: $" + basePlusCommissionEmployee.getGrossSales());
		System.out.println("Commission Rate: " + basePlusCommissionEmployee.getCommissionRate());
		System.out.println("Base Salary: $" + basePlusCommissionEmployee.getBaseSalary());
		System.out.println("Earnings: $" + basePlusCommissionEmployee.calculateEarnings());
	}
}
