package question.six;
abstract class Employee {
    private String name;
    private int SSN;
    private String address;

    public Employee(String name, int SSN, String address) {
        this.name = name;
        this.SSN = SSN;
        this.address = address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getSSN() {
        return SSN;
    }

    // Abstract method
    public abstract double earnings();
}

