package question.six;

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int numberOfHours;

    public HourlyEmployee(String name, int SSN, String address, double hourlyRate, int numberOfHours) {
        super(name, SSN, address);
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    @Override
    public double earnings() {
        return hourlyRate * numberOfHours;
    }
}

