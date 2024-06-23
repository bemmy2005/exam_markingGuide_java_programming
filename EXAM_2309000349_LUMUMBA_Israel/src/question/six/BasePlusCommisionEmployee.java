package question.six;

public class BasePlusCommisionEmployee extends CommisionEmployee {
private double base;
//setters
public void setBase(double base) {
	this.base = base;
}
//method
double Earning (){
	return base;
}
public void DisplayAllDetails(){
	System.out.println("Base "+base);
}
}
