//Kwizera Remy
//2205000689
package question.six;

public abstract class Employee {
    private String name;
    private int id;
    private String address;

    public Employee(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public abstract double earnings(); // Abstract method to calculate earnings

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}
