//Kwizera Remy
//2205000689
package question.six;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        employees[0] = new CommissionEmployee("Alice", 1, "muhoza", 10000, 0.06);
        employees[1] = new BaseCommissionEmployee("Bob", 2, "kinyinya", 5000, 0.04, 300);
        employees[2] = new HourlyEmployee("Charlie", 3, "karisimbi", 20, 160);
        employees[3] = new SalariedEmployee("David", 4, "gasaka", 800, 100, 50);

        for (Employee emp : employees) {
            if (emp instanceof Displayable) {
                ((Displayable) emp).display();
            }
        }
    }
}
