package question.six;

public class HourlyEmployee extends Employee {
private double Hour_rate;
private int Number_of_hours;
//setters
public void setHour_rate(double hour_rate) {
	Hour_rate = hour_rate;
}
public void setNumber_of_hours(int number_of_hours) {
	Number_of_hours = number_of_hours;
}
//method
double Earning(){
	return Hour_rate*Number_of_hours;
	
}

public void DisplayAllDetails() {
	System.out.println("Hour_rate "+Hour_rate);
	System.out.println("Number_of_hours "+Number_of_hours);
	
}
public void DisplayEarning() {

	
}

}
