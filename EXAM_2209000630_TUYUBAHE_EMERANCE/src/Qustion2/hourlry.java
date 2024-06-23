package Qustion2;

public class hourlry {
	public class HourlyEmployee extends Employee {
	    private double hourRate;
	    private int numberOfHours;

	    public void setHourRate(double rate) {
	        this.hourRate = rate;
	    }

	    public void setNumberOfHours(int hours) {
	        this.numberOfHours = hours;
	    }

	    @Override
	    public double earning() {
	        return hourRate * numberOfHours;
	    }}}
	


