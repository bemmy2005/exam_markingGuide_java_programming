package questiontwo;

public class Student {
private int id;
private String name;
private int grade;
private int feesPaid=0;
private int feesTotal=30000;
Student(int id, String name, int grade) {
	super();
	this.id = id;
	this.name = name;
	this.grade = grade;
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
public int getGrade() {
	return grade;
}
public void setGrade(int grade) {
	this.grade = grade;
}
public int getFeesPaid() {
	return feesPaid;
}
public void setFeesPaid(int feesPaid) {
	this.feesPaid = feesPaid;
}
public int getFeesTotal() {
	return feesTotal;
}
public void setFeesTotal(int feesTotal) {
	this.feesTotal = feesTotal;
}
public static int payFees(int amount){
	return amount;
}}
