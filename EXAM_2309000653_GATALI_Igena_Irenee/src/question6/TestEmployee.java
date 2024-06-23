package question6;
	import java.util.Scanner;
	public class TestEmployee {
	    public static void main(String[] args) {
	        // Creating instances of each type of Employee
	        CommissionEmployee commissionEmployee = new CommissionEmployee();
	        commissionEmployee.setName("John Doe");
	        commissionEmployee.setSSN(123456789);
	        commissionEmployee.setGrossSales(5000.00);
	        commissionEmployee.setCommissionRate(0.1);
	        
	        HourlyEmployee hourlyEmployee = new HourlyEmployee();
	        hourlyEmployee.setName("Jane Smith");
	        hourlyEmployee.setSSN(987654321);
	        hourlyEmployee.setHourRate(20.00);
	        hourlyEmployee.setNumberOfHours(40);
	        
	        SalariedEmployee salariedEmployee = new SalariedEmployee();
	        salariedEmployee.setName("Alice Johnson");
	        salariedEmployee.setSSN(112233445);
	        salariedEmployee.setSalary(1000.00);
	        salariedEmployee.setBonus(200.00);
	        salariedEmployee.setDeductions(50.00);
	        
	        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee();
	        basePlusCommissionEmployee.setName("Bob Brown");
	        basePlusCommissionEmployee.setSSN(998877665);
	        basePlusCommissionEmployee.setGrossSales(3000.00);
	        basePlusCommissionEmployee.setCommissionRate(0.15);
	        basePlusCommissionEmployee.setBase(500.00);
	        
	        // Display earnings for each employee
	        System.out.println(commissionEmployee.getName() + " earns " + commissionEmployee.earning());
	        System.out.println(hourlyEmployee.getName() + " earns " + hourlyEmployee.earning());
	        System.out.println(salariedEmployee.getName() + " earns " + salariedEmployee.earning());
	        System.out.println(basePlusCommissionEmployee.getName() + " earns " + basePlusCommissionEmployee.earning());
	    }
	}



