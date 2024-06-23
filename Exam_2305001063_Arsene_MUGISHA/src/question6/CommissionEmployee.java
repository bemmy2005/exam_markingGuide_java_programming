package question6;
/*Arsene MUGISHA
 * REG: 2305001063
 */
public class CommissionEmployee extends Employee{
	
	double grosssales;
	double commissionrate;
	
	public double getGrosssales() {
		return grosssales;
	}
	public void setGrosssales(double grosssales) {
		this.grosssales = grosssales;
	}
	public double getCommissionrate() {
		return commissionrate;
	}
	public void setCommissionrate(double commissionrate) {
		this.commissionrate = commissionrate;
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
		return "CommissionEmployee [grosssales=" + grosssales
				+ ", commissionrate=" + commissionrate + ", getCompname()="
				+ getCompname() + ", getFax()=" + getFax() + ", getName()="
				+ getName() + ", getSnn()=" + getSnn() + ", getAddress()="
				+ getAddress() + "]";
	}
	public void DisplayDetails() {
		// TODO Auto-generated method stub
		
	}
	public void DisplayEarnings() {
		// TODO Auto-generated method stub
		
	}
	
	

}
