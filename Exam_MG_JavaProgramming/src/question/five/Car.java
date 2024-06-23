package question.five;

public class Car {
	private String make;
	private int yearModel;

	// Constructor
	public Car(String make, int yearModel) {
		this.make = make;
		this.yearModel = yearModel;
	}

	// Setters
	public void setMake(String make) {
		this.make = make;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	// Getters
	public String getMake() {
		return make;
	}

	public int getYearModel() {
		return yearModel;
	}

	public static void main(String[] args) {
		Car car = new Car("Toyota", 2020);
		System.out.println("Make: " + car.getMake());
		System.out.println("Year Model: " + car.getYearModel());

		car.setMake("Honda");
		car.setYearModel(2022);
		System.out.println("Updated Make: " + car.getMake());
		System.out.println("Updated Year Model: " + car.getYearModel());
	}
}