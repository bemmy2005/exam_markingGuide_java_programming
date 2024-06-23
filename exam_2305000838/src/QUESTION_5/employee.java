package QUESTION_5;

public abstract class employee {
	
	private String name;
	private int snn;
	private String address;
	private String companyname;
	private String fax;
	public Object setCommissionrate;
	public Object grosssales;
	public Object setCommissionrate1;
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
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	protected abstract void setCommissionrate(double commissionrate);
	protected abstract void grosssales(double grosssales);
	
	

}
