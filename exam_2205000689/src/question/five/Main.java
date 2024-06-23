package question.five;

public class Main{

	public static void main(String[] args) {
	Car car = new Car();
	CellPhone phone = new CellPhone();
	
	System.out.println("this was produced by "+phone.manufact+"and it is "+phone.Model+"which cost"+phone.RetailPrice);
	System.out.println("this is "+car.make+" and it was manufactured in "+car.yearmodel);
	
	}
}
