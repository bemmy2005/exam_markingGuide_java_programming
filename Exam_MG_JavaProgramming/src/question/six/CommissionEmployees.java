package question.six;

class CommissionEmployees extends Employee implements Displayable {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployees(String name, int SSN, String address, double grossSales, double commissionRate) {
        super(name, SSN, address);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public void displayAllDetails() {
        System.out.println("Name: " + getName());
        System.out.println("SSN: " + getSSN());
        System.out.println("Address: " + address);
        System.out.println("Gross Sales: " + grossSales);
        System.out.println("Commission Rate: " + commissionRate);
    }

    @Override
    public void displayEarnings() {
        System.out.println("Earnings: " + earnings());
    }
}

