package Question_6;

	public class SalariedEmployee extends Employee {
	    private double salary;

	    public SalariedEmployee(String name, int socialSecurityNumber, String address, double salary) {
	        super(name, socialSecurityNumber, address);
	        this.salary = salary;
	    }

	    @Override
	    public double calculateEarnings() {
	        return salary;
	    }
	}


