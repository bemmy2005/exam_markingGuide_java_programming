package Question5;
import java.util.*;
public class Testcellphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cellphone;
      cellphone cell= new (System.in);
      System.out.println("enter the cellphone");
      cellphone=cell.next();
      System.out.println("enter the model of cellphone");
      String model=cell.next();
      System.out.println("enter the retailprice of cellphone");
      double retailprice=cell.nextdouble();
      System.out.println("enter the manufact of cellphone");
      String manufact=cell.next();
      cell.model();
      cell.retailPrice();
      cell.manufact();
	}

}
