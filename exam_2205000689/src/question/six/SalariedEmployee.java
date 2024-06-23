//Kwizera Remy
//2205000689
package question.six;

public class SalariedEmployee extends Employee implements Displayable {
    private double salary;
    private double bonus;
    private double deductions;

    public SalariedEmployee(String name, int id, String address, double salary, double bonus, double deductions) {
        super(name, id, address);
        this.salary = salary;
        this.bonus = bonus;
        this.deductions = deductions;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public double getDeductions() {
        return deductions;
    }

    @Override
    public double earnings() {
        return salary + bonus - deductions;
    }

    @Override
    public void display() {
        System.out.println(this);
        System.out.println("Earnings: " + earnings());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Salary: " + salary +
                ", Bonus: " + bonus +
                ", Deductions: " + deductions;
    }
}
