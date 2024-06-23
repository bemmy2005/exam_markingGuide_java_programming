//Nyirabaziga ituze merveille
//2301000975

package QuestionSix;

import java.util.Scanner;

public class TestEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int choose;
		System.out.println("What Kind Of Employee are you!.\n1.Commission E \n2.Hourly E \n3.Salaied E   or \n4.Base Plus Commision E");
		choose=in.nextInt();
		
		if(choose==1){
		CommissionEmployee e1=new CommissionEmployee();
		
		System.out.println("Enter Your Company name:");
		e1.setCompname(in.next());
		System.out.println("Company Fax:");
		e1.setFax(in.next());
		System.out.println("Enter Your name:");
		e1.setName(in.next());
		System.out.println("Enter Your address:");
		e1.setAddress(in.next());
		System.out.println("Enter Your Serial number:");
		e1.setSnn(in.nextInt());
		System.out.println("Enter Your Commission rate:");
		e1.setCommissionrate(in.nextDouble());
		System.out.println("Enter your gross sale:");
		e1.setGrosssales(in.nextDouble());
		System.out.println(e1.toString());
		}
		else if(choose==2){
			HourlyEmployee e1=new HourlyEmployee();
			System.out.println("Enter Your Company name:");
			e1.setCompname(in.next());
			System.out.println("Company Fax:");
			e1.setFax(in.next());
			System.out.println("Enter Your name:");
			e1.setName(in.next());
			System.out.println("Enter Your address:");
			e1.setAddress(in.next());
			System.out.println("Enter Your Serial number:");
			e1.setSnn(in.nextInt());
			System.out.println("Enter Your Hourly rate:");
			e1.setHourrate(in.nextDouble());
			System.out.println("How many numbers your work per day:");
			e1.setNofhours(in.nextDouble());
			System.out.println(e1.toString());
		}
		else if(choose==3){
			SalariedEmployee e1=new SalariedEmployee();
			System.out.println("Enter Your Company name:");
			e1.setCompname(in.next());
			System.out.println("Company Fax:");
			e1.setFax(in.next());
			System.out.println("Enter Your name:");
			e1.setName(in.next());
			System.out.println("Enter Your address:");
			e1.setAddress(in.next());
			System.out.println("Enter Your Serial number:");
			e1.setSnn(in.nextInt());
			System.out.println("Enter Your Saraly:");
			e1.setSalary(in.nextDouble());
			System.out.println("How much is your bonus:");
			e1.setBonus(in.nextDouble());
			System.out.println("How much Deducted money from your salary:");
			e1.setDeductions(in.nextDouble());System.out.println(e1.toString());
			
	}if(choose==4){
		BasePlusCommissionEmployee e1=new BasePlusCommissionEmployee();
		System.out.println("Enter Your Company name:");
		e1.setCompname(in.next());
		System.out.println("Company Fax:");
		e1.setFax(in.next());
		System.out.println("Enter Your name:");
		e1.setName(in.next());
		System.out.println("Enter Your address:");
		e1.setAddress(in.next());
		System.out.println("Enter Your Serial number:");
		e1.setSnn(in.nextInt());
		System.out.println("Enter Your Commission rate:");
		e1.setCommissionrate(in.nextDouble());
		System.out.println("Enter your gross sale:");
		e1.setGrosssales(in.nextDouble());
		System.out.println("How much is your base plus:");
		e1.setBase(in.nextDouble());System.out.println(e1.toString());
		
	}
}}
