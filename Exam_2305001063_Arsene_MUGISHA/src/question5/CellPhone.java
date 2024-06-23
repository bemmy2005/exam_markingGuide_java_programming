package question5;
/*Arsene MUGISHA
 * REG: 2305001063
 */
public class CellPhone {
	
	private String manufact;
	private String model;
	private double reatailPrice;
	
	public String getManufact() {
		return manufact;
	}
	public void setManufact(String manufact) {
		this.manufact = manufact;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getReatailPrice() {
		return reatailPrice;
	}
	public void setReatailPrice(double reatailPrice) {
		this.reatailPrice = reatailPrice;
	}
	public String toString() {
		return "CellPhone [manufact=" + manufact + ", model=" + model
				+ ", reatailPrice=" + reatailPrice + "]";
	}
	
	
	

}
