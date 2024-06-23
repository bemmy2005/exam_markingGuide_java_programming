package Question5;

public class car {
String make;
int yearModel;
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public int getYearModel() {
	return yearModel;
}
public void setYearModel(int yearModel) {
	this.yearModel = yearModel;
}
public car(String make, int yearModel) {
	super();
	this.make = make;
	this.yearModel = yearModel;
}

}
