//TEDD WUNDE ATU 2209000458
package question.five;

public class Car {
	String make;
	String yearModel;
	//constructor
	public Car(String make, String yearModel) {
		super();
		this.make = make;
		this.yearModel = yearModel;
	}
	public Car(){
		
	}
	
	//setters and getters for car
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	public String getYearModel() {
		return yearModel;
	}
	public void setYearModel(String yearModel) {
		this.yearModel = yearModel;
	}
	
	@Override
	public String toString() {
		return "Car [make=" + make + ", yearModel=" + yearModel + "]";
	}
	
	
	

}
