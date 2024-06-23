package question.two;

public class Student  {
private int id;
private String name;
private String grade;
private double feesPaid;
private double feesTotal;
//CONSTRUCTOR
public Student(int id, String name, String grade) {
	super();
	this.id = id;
	this.name = name;
	this.grade = grade;
	this.feesPaid = 500;
	this.feesTotal = 1200;
}
//SETTERS AND GETTERS
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
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public double getFeesPaid() {
	return feesPaid;
}
public void setFeesPaid(double feesPaid) {
	this.feesPaid = feesPaid;
}
public double getFeesTotal() {
	return feesTotal;
}
public void setFeesTotal(double feesTotal) {
	this.feesTotal = feesTotal;
}

//METHOD
double setFees(){
	return feesTotal-feesPaid;
	
}

}
