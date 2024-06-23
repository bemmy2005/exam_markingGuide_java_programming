package question5;
/*Arsene MUGISHA
 * REG: 2305001063
 */
import java.util.Scanner;

public class TestCellPhone {

	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		//Creating new instance of CellPhone object
		CellPhone c1=new CellPhone();
		
		System.out.println("Enter Company name:");
		c1.setManufact(in.next());
		System.out.println("Enter Model of TellPhone:");
		c1.setModel(in.next());
		System.out.println("How much it is:");
		c1.setReatailPrice(in.nextDouble());
		//Print out result
		System.out.println(c1.toString());

	}

}
