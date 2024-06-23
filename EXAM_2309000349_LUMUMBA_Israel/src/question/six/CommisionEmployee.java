package question.six;

public class CommisionEmployee extends Employee {
private double Gross_sales;
private double commission_rate;
public void setGross_sales(double gross_sales) {
	Gross_sales = gross_sales;
}
//setter
public void setCommission_rate(double commission_rate) {
	this.commission_rate = commission_rate;
}
//method 
double Earning(){
	return Gross_sales*commission_rate; 
}
public void DisplayAllDetails(){
	System.out.println("Gross_sales "+Gross_sales);
	System.out.println("Gross_sales "+commission_rate);
	
}
public void DisplayEarning() {
	
	
}



}
