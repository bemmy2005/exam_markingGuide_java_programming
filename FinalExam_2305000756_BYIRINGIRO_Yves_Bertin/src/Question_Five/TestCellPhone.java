package Question_Five;
import java.util.Scanner;
public class TestCellPhone {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Cellphone Cp=new Cellphone();
		System.out.println("Enter manufacturer name:");
        Cp.setManufact(input.next());
		System.out.println("Enter the model:");
		Cp.setModel(input.next());
		System.out.println("Enter retail price:");
		Cp.setRetailPrice(input.nextDouble());
		System.out.println(Cp.toString());
	}
}
