package Question_Five;
import java.util.Scanner;
public class TestCar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
			Car Cr=new Car();
			System.out.println("Enter Company that manufactured your car:");
			Cr.setMake(input.next());
			System.out.println("Plese enter year of model of your car:");
			Cr.setYearModel(input.nextInt());
	}
}