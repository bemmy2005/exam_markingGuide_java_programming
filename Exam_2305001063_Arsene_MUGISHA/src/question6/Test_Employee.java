package question6;
/*Arsene MUGISHA
 * REG: 2305001063
 */
import java.util.Scanner;

public class Test_Employee {

	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		//creating valiable for choosing
		int choose;
		System.out.println("Choose the Type of Employee(E) you are:\n1.Commission E \n2.Hourly E \n3.Salaied E   or \n4.Base Plus Commision E");
		choose=in.nextInt();
		//switching to choosen number
		if(choose==1){
		CommissionEmployee e1=new CommissionEmployee();
		
		System.out.println("Enter Your Company name:");
		e1.setFax("GI222");
		e1.setFax(in.next());
		System.out.println("Enter Your name:");
		e1.setName(in.next());
		System.out.println("Enter Your address:");
		e1.setAddress(in.next());
		System.out.println("Enter Your Serial number:");
		e1.setSnn(in.nextInt());
		e1.setCommissionrate(20);
		e1.setGrosssales(3000);
		System.out.println(e1.toString());
		}
		else if(choose==2){
			HourlyEmployee e1=new HourlyEmployee();
			System.out.println("Enter Your Company name:");
			e1.setCompname(in.next());
			e1.setFax("GI222");
			System.out.println("Enter Your name:");
			e1.setName(in.next());
			System.out.println("Enter Your address:");
			e1.setAddress(in.next());
			e1.setSnn(34454);
			e1.setHourrate(20);
			System.out.println("How many numbers your work per day:");
			e1.setNofhours(in.nextDouble());
			System.out.println(e1.toString());
		}
		else if(choose==3){
			SalariedEmployee e1=new SalariedEmployee();
			System.out.println("Enter Your Company name:");
			e1.setCompname(in.next());
			e1.setFax("GI222");
			System.out.println("Enter Your name:");
			e1.setName(in.next());
			System.out.println("Enter Your address:");
			e1.setAddress(in.next());
			System.out.println("Enter Your Serial number:");
			e1.setSnn(in.nextInt());
			System.out.println("Enter Your Saraly:");
			e1.setSalary(in.nextDouble());
			e1.setBonus(500);
			e1.setDeductions(300);
			System.out.println(e1.toString());
			
	}if(choose==4){
		BasePlusCommissionEmployee e1=new BasePlusCommissionEmployee();
		System.out.println("Enter Your Company name:");
		e1.setCompname(in.next());
		e1.setFax("GI222");
		System.out.println("Enter Your name:");
		e1.setName(in.next());
		System.out.println("Enter Your address:");
		e1.setAddress(in.next());
		e1.setSnn(24055);
		e1.setCommissionrate(20);
		e1.setGrosssales(3000);
		e1.setBase(in.nextDouble());System.out.println(e1.toString());
		
	}
}}
