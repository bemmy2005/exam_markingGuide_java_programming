package question6;
/*Arsene MUGISHA
 * REG: 2305001063
 */
public abstract class Employee implements Displayable{
	
	private String compname;
	private String fax;
	private String name;
	private int snn;
	private String address;
	public String getCompname() {
		return compname;
	}
	public void setCompname(String compname) {
		this.compname = compname;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSnn() {
		return snn;
	}
	public void setSnn(int snn) {
		this.snn = snn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
