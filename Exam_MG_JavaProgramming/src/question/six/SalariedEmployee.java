package question.six;

class SalariedEmployee extends Employee {
    private double salary;
    private double bonus;
    private double deductions;

    public SalariedEmployee(String name, int SSN, String address, double salary, double bonus, double deductions) {
        super(name, SSN, address);
        this.salary = salary;
        this.bonus = bonus;
        this.deductions = deductions;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    @Override
    public double earnings() {
        return salary + bonus - deductions;
    }
}

