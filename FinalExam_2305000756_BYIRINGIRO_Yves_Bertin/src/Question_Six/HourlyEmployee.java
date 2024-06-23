package Question_Six;
public class HourlyEmployee extends Employee{
	private double hourRate;
	private int numberOfHours;

	public void setHourRate(double rate) {
		this.hourRate = rate;
	}

	public void setNumberOfHours(int hours) {
		this.numberOfHours = hours;
	}

	@Override
	public void displayAllDetails() {

	}
	@Override
	public void displayEarnings() {	
	}

	@Override
	public double earning() {
		// TODO Auto-generated method stub
		return hourRate * numberOfHours;
	}
}
