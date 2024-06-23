package question5;
//Jacques MUGISHA 2309001177
import java.util.Scanner;



public class TestCar {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input= new Scanner (System.in);
		Car myCar= new Car("",0);
		System.out.println(" what is your car maker?");
		myCar.setMake(input.next());
		System.out.println(" what is your car Year Model?");
		myCar.setYearModel(input.nextInt());
		
		System.out.println("Your Car make is: "+myCar.getMake());
		System.out.println(" Your Car Year Model is: "+myCar.getYearModel());
		
	}

}
