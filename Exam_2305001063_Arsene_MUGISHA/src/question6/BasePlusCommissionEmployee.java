package question6;
/*Arsene MUGISHA
 * REG: 2305001063
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
	
	double basePlusPlus;

	public double getBase() {
		return basePlusPlus;
	}

	public void setBase(double basePlusPlus) {
		this.basePlusPlus = basePlusPlus;
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
		return "BasePlusCommissionEmployee [basePlusPlus=" + basePlusPlus
				+ ", getGrosssales()=" + getGrosssales()
				+ ", getCommissionrate()=" + getCommissionrate()
				+ ", toString()=" + super.toString() + ", getCompname()="
				+ getCompname() + ", getFax()=" + getFax() + ", getName()="
				+ getName() + ", getSnn()=" + getSnn() + ", getAddress()="
				+ getAddress() + "]";
	}
	
	

}
