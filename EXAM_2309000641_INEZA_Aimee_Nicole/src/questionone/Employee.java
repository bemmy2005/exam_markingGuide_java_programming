package questionone;
public class Employee {
    private int id;
    private String name;
    private String position;
   
    // Constructors
    public Employee() {}

    public Employee(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
       
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getname() { return name; }
    public void setname(String name) { this.name = name; }

    public String getposition() { return position; }
    public void setposition(String position) { this.position = position; }

}