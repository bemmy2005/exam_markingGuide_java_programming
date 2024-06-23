
package questionsix;

class SalariedEmployee extends Employee {
    private double salary;
    private double bonus;
    private double deduction;

    public SalariedEmployee(String name, String ssn, String address, double salary, double bonus, double deduction) {
        super(name, ssn, address);
        this.salary = salary;
        this.bonus = bonus;
        this.deduction = deduction;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

   
    public double earnings() {
        return salary + bonus - deduction;
    }

   
    public void displayDetails() {
        System.out.println("Salaried Employee: " + getName());
        System.out.println("SSN: " + getSsn());
        System.out.println("Address: " + getAddress());
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Deduction: " + deduction);
        System.out.println("Earnings: " + earnings());
    }
}
