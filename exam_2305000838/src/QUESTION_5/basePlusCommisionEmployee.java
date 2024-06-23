package QUESTION_5;

public class basePlusCommisionEmployee extends employee {
	double base;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setGrosssales(double grosssales) {
		// TODO Auto-generated method stub
		Object object = super.grosssales;
	}

	public void setCommissionrate(double commissionrate) {
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
		return "BasePlusCommissionEmployee [base=" + base
				+ ", getGrosssales()=" + getGrosssales()
				+ ", getCommissionrate()=" + getCommissionrate()
				+ ", toString()=" + super.toString() + ", getCompname()="
				+ getCompanyname() + ", getFax()=" + getFax() + ", getName()="
				+ getName() + ", getSnn()=" + getSnn() + ", getAddress()="
				+ getAddress() + "]";
	}

	private String getCommissionrate() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getGrosssales() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void grosssales(double grosssales) {
		// TODO Auto-generated method stub
		
	}
	

}
