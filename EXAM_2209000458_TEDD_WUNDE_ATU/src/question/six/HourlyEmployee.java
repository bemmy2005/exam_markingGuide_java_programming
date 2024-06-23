//TEDD WUNDE ATU 2209000458
package question.six;


public class HourlyEmployee extends Employee {
	double Hourly_rate;
	int Number_of_hours;
	
	//constructor
	public HourlyEmployee(double hourly_rate, int number_of_hours) {
		
		this.Hourly_rate = hourly_rate;
		this.Number_of_hours = number_of_hours;
	}
	//setters
	public void setHourly_rate(double hourly_rate) {
		Hourly_rate = hourly_rate;
	}
	public void setNumber_of_hours(int number_of_hours) {
		Number_of_hours = number_of_hours;
	}
	
	double Earning() {
		
		return Hourly_rate*Number_of_hours;
	}
	 public void DisplayAllDetails() {
		    System.out.println("Name: " + getName());
	        System.out.println("SSN: " + getSSN());
	        System.out.println("CompanyName: " + CompanyName);
	        System.out.println("Fax: " + Fax);
	        System.out.println("Hourly Rate: " + Hourly_rate);
	        System.out.println("Number of Hours: " + Number_of_hours);
	    }

}
