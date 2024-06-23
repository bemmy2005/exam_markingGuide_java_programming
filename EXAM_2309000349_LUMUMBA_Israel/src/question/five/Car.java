package question.five;

public class Car {
private String make;
private int yearmodel;
//Setter and Getter
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public int getYearmodel() {
	return yearmodel;
}
public void setYearmodel(int yearmodel) {
	this.yearmodel = yearmodel;
}
//to String
public String toString() {
	return "Car [make=" + make + ", yearmodel=" + yearmodel + "]";
}

}
