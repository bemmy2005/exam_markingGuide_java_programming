package questionfive;

import questionfive.Car;

public class TestCar {
	public static void main(String[] args) {
		Car model=new Car();
		model.setmake("TOYOTA");
		model.setYearmodel(2000);
		System.out.println(model.tostring());
		

	}

	public String toString() {
		return "Testcar [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
