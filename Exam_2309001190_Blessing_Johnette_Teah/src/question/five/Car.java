package question.five;

public class Car {
	private String make;
	private int yearModel;
	
	//
	
public String getMake() {
		return make;
	}
	public void setMake(int make) {
		this.make = make;
	}
	public int getYearModel() {
		return yearModel;
	}
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	
	
	//to string
	
	
@Override
	public String toString() {
		return "Car [make=" + make + ", yearModel=" + yearModel + "]";
	}
}