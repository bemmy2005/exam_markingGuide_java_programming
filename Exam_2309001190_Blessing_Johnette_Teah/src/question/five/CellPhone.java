package question.five;

public class CellPhone {
	private String manufac;
	private String model;
	private double retailPrice;
	
	
	//
	public String getManufac() {
		return manufac;
	}
	public void setManufac(String manufac) {
		this.manufac = manufac;
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
	
	
	//To string
	@Override
	public String toString() {
		return "CellPhone [manufac=" + manufac + ", model=" + model
				+ ", retailPrice=" + retailPrice + "]";
	}
	

}
