//TEDD WUNDE ATU 2209000458
package question.five;

import java.util.Scanner;


public class MainCellPhone {
	public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	CellPhone cellphone=new CellPhone();
	//prompting user for input
	System.out.print("Enter your CellPhone manufact: ");
	String manufact=scanner.nextLine();
	cellphone.setManufact(manufact);
	String manu=cellphone.getManufact();
	
	System.out.print("Enter your CellPhone model: ");
	String model=scanner.nextLine();
	cellphone.setModel(model);
	String mod=cellphone.getModel();
	
	System.out.print("Enter your CellPhone retailPrice: ");
	double retailPrice=scanner.nextDouble();
	cellphone.setRetailPrice(retailPrice);
	double ret=cellphone.getRetailPrice();
	
	System.out.println("Your cellphone manufacturer is : "+manu+" ,model is "+mod+" and Retail Price is "+ret);

	}

}
