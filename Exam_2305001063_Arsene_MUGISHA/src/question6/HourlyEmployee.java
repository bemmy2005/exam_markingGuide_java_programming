package question6;
/*Arsene MUGISHA
 * REG: 2305001063
 */
public class HourlyEmployee extends Employee{
	
	double hourrate;
	double nofhours;
	
	public double getHourrate() {
		return hourrate;
	}
	public void setHourrate(double hourrate) {
		this.hourrate = hourrate;
	}
	public double getNofhours() {
		return nofhours;
	}
	public void setNofhours(double nofhours) {
		this.nofhours = nofhours;
	}
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	public void setSnn(int snn) {
		// TODO Auto-generated method stub
		super.setSnn(snn);
	}
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		super.setAddress(address);
	}
	public void setCompname(String compname) {
		// TODO Auto-generated method stub
		super.setCompname(compname);
	}
	public void setFax(String fax) {
		// TODO Auto-generated method stub
		super.setFax(fax);
	}
	public String toString() {
		return "HourlyEmployee [hourrate=" + hourrate + ", nofhours="
				+ nofhours + ", getCompname()=" + getCompname() + ", getFax()="
				+ getFax() + ", getName()=" + getName() + ", getSnn()="
				+ getSnn() + ", getAddress()=" + getAddress() + "]";
	}
	public void DisplayDetails() {
		// TODO Auto-generated method stub
		
	}
	public void DisplayEarnings() {
		// TODO Auto-generated method stub
		
	}
	
	

}
