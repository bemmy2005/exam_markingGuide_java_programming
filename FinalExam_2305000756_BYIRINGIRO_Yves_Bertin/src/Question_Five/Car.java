package Question_Five;
public class Car {
	String Make;
	int YearModel;

	public String getMake() {
		return Make;
	}

	public void setMake(String make) {
		Make = make;
	}

	public int getYearModel() {
		return YearModel;
	}

	public void setYearModel(int yearModel) {
		YearModel = yearModel;
	}

	public static void main(String[] args) {
		Car cr=new Car();
		cr.setMake("Toyota");
		cr.setYearModel(2020);
		cr.getMake();
		cr.getYearModel();
	}
}