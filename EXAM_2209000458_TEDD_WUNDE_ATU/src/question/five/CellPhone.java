//TEDD WUNDE ATU 2209000458
package question.five;

public class CellPhone {
	String manufact;
	String model;
	double retailPrice;
	
	//setters and getters
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
	public double getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}
	//toString method
	@Override
	public String toString() {
		return "MainCellPhone [manufact=" + manufact + ", model=" + model
				+ ", retailPrice=" + retailPrice + "]";
	}
	
	
	


}
