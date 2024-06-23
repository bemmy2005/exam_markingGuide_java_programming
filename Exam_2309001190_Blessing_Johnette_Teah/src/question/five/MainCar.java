package question.five;

public class MainCar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car c = new Car();
		c.setMake(12);
		c.setYearModel(1999);
		c.getMake();
		c.getYearModel();
		
		System.out.println(c.toString());
	}

}
