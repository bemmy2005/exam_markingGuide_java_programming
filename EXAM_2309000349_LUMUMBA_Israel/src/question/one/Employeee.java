package question.one;

public class Employeee {
private int id;
private String name;
private String position;
//constructor
public Employeee(int id, String name, String position) {
	super();
	this.id = id;
	this.name = name;
	this.position = position;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}

}
