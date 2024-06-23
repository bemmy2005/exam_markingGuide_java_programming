package Question_Six;
public class Main_Employee {
	public static void main(String[] args) {
		// Creating instances of each type of Employee
		CommissionEmployee CE = new CommissionEmployee();
		CE.setName("John Doe");
		CE.setSSN(123456789);
		CE.setGrossSales(5000.00);
		CE.setCommissionRate(0.1);

		HourlyEmployee HE = new HourlyEmployee();
		 HE.setName("Jane Smith");
		 HE.setSSN(987654321);
		 HE.setHourRate(20.00);
		 HE.setNumberOfHours(40);

		SalariedEmployee SE = new SalariedEmployee();
		SE.setName("Alice Johnson");
		SE.setSSN(112233445);
		SE.setSalary(1000.00);
		SE.setBonus(200.00);
		SE.setDeductions(50.00);

		BasePlusCommissionEmployee BPCE = new BasePlusCommissionEmployee();
		BPCE.setName("Bob Brown");
		BPCE.setSSN(998877665);
		//basePlusCommissionEmployee.setGrossSales(3000.00);
		//basePlusCommissionEmployee.setCommissionRate(0.15);
		BPCE.setBase(500.00);

		// Display earnings for each employee
		System.out.println(CE.getName() + " earns " + CE.earning());
		System.out.println(HE.getName() + " earns " + HE.earning());
		System.out.println(SE.getName() + " earns " + SE.earning());
		System.out.println(BPCE.getName() + " earns " + BPCE.earning());
	}

}
