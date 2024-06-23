//Kwizera Remy
//2205000689
package question.six;

public class HourlyEmployee extends Employee implements Displayable {
    private double hourlyRate;
    private int numberOfHours;

    public HourlyEmployee(String name, int id, String address, double hourlyRate, int numberOfHours) {
        super(name, id, address);
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    @Override
    public double earnings() {
        return hourlyRate * numberOfHours;
    }

    @Override
    public void display() {
        System.out.println(this);
        System.out.println("Earnings: " + earnings());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Hourly Rate: " + hourlyRate +
                ", Number of Hours: " + numberOfHours;
    }
}
