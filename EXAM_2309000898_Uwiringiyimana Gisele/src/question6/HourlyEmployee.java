
package question6;

 public class HourlyEmployee extends Employee {
    private double  hourRate;
    private int  numberOfHours;

    public HourlyEmployee(String name, int ssn, String address, double  hourRate, int  numberOfHours) {
        super(name, ssn, address);
        this.hourRate = hourRate;
        this.numberOfHours = numberOfHours;
    }

    public void setHourRate(double  hourRate) {
        this.hourRate = hourRate;
    }

    public void setNumberOfHours(int  numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

	public double earnings() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void displayDetails() {
		// TODO Auto-generated method stub
		
	}
 }
