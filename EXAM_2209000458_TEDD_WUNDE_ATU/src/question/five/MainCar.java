//TEDD WUNDE ATU 2209000458
package question.five;

import java.util.Scanner;


public class MainCar {
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	//instantiating a car
	Car car=new Car();
	 System.out.print("Enter your Car make: ");
     String make = input.nextLine();
     car.setMake(make);
     
     System.out.print("Enter your Car yearModel: ");
     String yearModel=input.nextLine();
     car.setYearModel(yearModel);
     String year=car.getYearModel();
     
     System.out.println("Your Car make is :"+car.getMake()+" and your Car Year Model is :"+year);
     
     
	}

}
