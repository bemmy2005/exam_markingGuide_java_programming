package QUESTION_5;

public abstract class hourly_employee  extends employee{
	double hourRate;
	double numberOfHours;
	
	
	public double getHourrate() {
		return hourRate;
	}
	public void setHourrate(double hourrate) {
		this.hourRate = hourrate;
	}
	public double getNofhours() {
		return numberOfHours;
	}
	public void setNofhours(double nofhours) {
		this.numberOfHours = nofhours;
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
		super.setCompanyname(compname);
	}
	public void setFax(String fax) {
		// TODO Auto-generated method stub
		super.setFax(fax);
	}
	public String toString() {
		return "HourlyEmployee [hourrate=" + hourRate + ", nofhours="
				+ numberOfHours + ", getCompname()=" + getCompanyname() + ", getFax()="
				+ getFax() + ", getName()=" + getName() + ", getSnn()="
				+ getSnn() + ", getAddress()=" + getAddress() + "]";
	}

}
