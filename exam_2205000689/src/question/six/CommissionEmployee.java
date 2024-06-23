//Kwizera Remy
//2205000689
package question.six;

public class CommissionEmployee extends Employee implements Displayable {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String name, int id, String address, double grossSales, double commissionRate) {
        super(name, id, address);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public void display() {
        System.out.println(this);
        System.out.println("Earnings: " + earnings());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Gross Sales: " + grossSales +
                ", Commission Rate: " + commissionRate;
    }
}
