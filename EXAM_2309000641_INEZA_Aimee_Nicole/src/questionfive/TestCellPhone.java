package questionfive;
import java.util.Scanner;
public class TestCellPhone {
public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	CellPhone phone=new CellPhone();
	System.out.println("please enter the manufact");
	phone.setmanufact(input.next());
	System.out.println("please enter the model");
	phone.setModel(input.next());
	System.out.println("please enter the price");
	phone.setretailprice(input.nextInt());
	System.out.println(phone.toString());
	
	

	}

}
