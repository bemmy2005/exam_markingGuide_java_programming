

package questionthree;
public class Teacher {
    private int id;
    private String name;
    private String subject;
   
    // Constructors
    public Teacher() {}

    public Teacher(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
       
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getname() { return name; }
    public void setname(String name) { this.name = name; }

    public String getsubject() { return subject; }
    public void setsubject(String subject) { this.subject = subject; }

}