package question.six;

public class Main {
    public static void main(String[] args) {
        CommissionEmployee ce = new CommissionEmployee("John Doe", 123456789, "123 Elm Street", 10000.0, 0.1);
        BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee("Jane Smith", 987654321, "456 Oak Avenue", 8000.0, 0.15, 3000.0);
        HourlyEmployee he = new HourlyEmployee("Jim Brown", 456789123, "789 Pine Road", 20.0, 160);
        SalariedEmployee se = new SalariedEmployee("Sara White", 654321987, "321 Birch Lane", 5000.0, 500.0, 100.0);

        ce.displayAllDetails();
        ce.displayEarnings();

        bpce.displayAllDetails();
        bpce.displayEarnings();

        he.displayAllDetails();
        he.displayEarnings();

        se.displayAllDetails();
        se.displayEarnings();
    }
}

