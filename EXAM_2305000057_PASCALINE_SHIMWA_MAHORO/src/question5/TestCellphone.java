//Pascaline Shimwa 2305000057
package question5;

import java.util.Scanner;

public class TestCellphone {

	
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		Cellphone myPhone= new Cellphone("",0,"");
		System.out.println(" what is your phone Manufacture?");
		myPhone.setManufacture(input.next());
		System.out.println(" what is your phone retail price?");
		myPhone.setRetailPrice(input.nextInt());
		System.out.println(" what is your phone model?");
		myPhone.setModel(input.next());

		
		System.out.println("Your phone manufacture is: "+myPhone.getManufacture());
		System.out.println(" Your phone retail price is: $"+myPhone.getRetailPrice());
		System.out.println(" Your phone Model is: "+myPhone.getModel());
	}

}
