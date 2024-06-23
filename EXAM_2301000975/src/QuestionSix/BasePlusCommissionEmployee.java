//Nyirabaziga ituze merveille 2301000975



package QuestionSix;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	
	double base;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setGrosssales(double grosssales) {
		// TODO Auto-generated method stub
		super.setGrosssales(grosssales);
	}

	public void setCommissionrate(double commissionrate) {
		// TODO Auto-generated method stub
		super.setCommissionrate(commissionrate);
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
		return "BasePlusCommissionEmployee [base=" + base
				+ ", getGrosssales()=" + getGrosssales()
				+ ", getCommissionrate()=" + getCommissionrate()
				+ ", toString()=" + super.toString() + ", getCompname()="
				+ getCompname() + ", getFax()=" + getFax() + ", getName()="
				+ getName() + ", getSnn()=" + getSnn() + ", getAddress()="
				+ getAddress() + "]";
	}
	
	

}
