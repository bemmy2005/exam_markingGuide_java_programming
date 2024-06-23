//Kwizera Remy
//2205000689
package question.six;

public class BaseCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BaseCommissionEmployee(String name, int id, String address, double grossSales, double commissionRate, double baseSalary) {
        super(name, id, address, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public void display() {
        System.out.println(this);
        System.out.println("Earnings: " + earnings());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Base Salary: " + baseSalary;
    }
}
