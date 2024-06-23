package questionfive;

public class Car {
	String make;
	int yearmodel;
	public String getmake() {
		return make;
	}
	public void setmake(String make) {
		this.make = make;
	}
	public int getYearmodel() {
		return yearmodel;
	}
	public void setYearmodel(int yearmodel) {
		this.yearmodel = yearmodel;
	}
	public String tostring(){
		return"car(make=" +make+ ", yearmodel+" +yearmodel +")";
	}

}
