package Question_Six;
public abstract class Employee implements Displayable{
	protected String name;
    protected int SSN;
    protected String address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getSSN() {
        return SSN;
    }

    public abstract double earning();
}