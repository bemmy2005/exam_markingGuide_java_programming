//TEDD WUNDE ATU 2209000458
package question.six;

import question.six.Displayable;

public abstract class Employee implements Displayable {
	String Name;
	int SSN;
	String Address;
	 String CompanyName;
	    String Fax;

	
	//getters and setters
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	 // Getters and setters for all the Displayable interface fields
    public String getCompanyName() {
        return CompanyName;
    }
    public void setCompanyName(String companyName) {
        this.CompanyName = companyName;
    }
    public String getFax() {
        return Fax;
    }
    public void setFax(String fax) {
        this.Fax = fax;
    }
    //Abstract method
    abstract double Earning();
    
    // Implement Displayable methods
    public void DisplayAllDetails() {
        System.out.println("Name: " + Name);
        System.out.println("SSN: " + SSN);
        System.out.println("Address: " + Address);
        System.out.println("CompanyName: " + CompanyName);
        System.out.println("Fax: " + Fax);
    }
    public void DisplayEarning() {
        System.out.println("Earnings: " + Earning());
    }





	

}
