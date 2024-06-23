package questionFive;

import java.util.Scanner;
public class CarMain {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("make: ");
	        String make = scanner.nextLine();

	        System.out.print("year of model: ");
	        String yearmode = scanner.nextLine();
	       Car car = null;
	        
	            System.out.println("make: " + Car.getMake());
	            System.out.println("YearMode: " +Car.getYearModel());
	            

	        scanner.close();
	    }
	}


