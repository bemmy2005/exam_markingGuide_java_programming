package qwestion5;

import javax.swing.plaf.synth.ColorType;




import java.util.Scanner;


public class Testcar {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter make: ");
    String make = scanner.nextLine();

    System.out.print("Enter yearmodel: ");
    String yearmodel = scanner.nextLine();

    
    Car car = null;

  

    System.out.print("manufacture: ");
    int manufacture = scanner.nextInt();

    System.out.print("Enter model: ");
    String address = scanner.next();
    System.out.print("retailprice: ");
    String retailprice = scanner.next();

    
       
            System.out.print("Enter manufactre: ");
            String manufacture1 = scanner.toString();

            System.out.print("Enter model: ");
           String model = scanner.toString();
           System.out.print("Enter model: ");
           String retailprice1 = scanner.toString();
            

        
    

    if (car != null) {
        System.out.println("make: " + make);
        System.out.println("yearmodel: " + yearmodel);
        System.out.println("manufacture: " + manufacture);
        System.out.println("retailprice: " + retailprice);
        System.out.println("model: " + make);

    scanner.close();

}}
private int ColorType() {
	// TODO Auto-generated method stub
	return 0;
}}