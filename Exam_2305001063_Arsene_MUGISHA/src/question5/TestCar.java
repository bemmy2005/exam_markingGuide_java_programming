package question5;
/*Arsene MUGISHA
 * REG: 2305001063
 */
import java.util.Scanner;

public class TestCar {

	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		Car c1=new Car();
		
		System.out.println("Enter Car Model:");
		c1.setMake(in.next());
		System.out.println("In which year car made:");
		c1.setYearModel(in.nextInt());
		System.out.println(c1.toString());
		

	}

}
