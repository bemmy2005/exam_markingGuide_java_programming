package question.five;

public class CellPhone {
	private String manufacture;
	private String model;
	private double retailprice;
	//setters and getters
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getRetailprice() {
		return retailprice;
	}
	public void setRetailprice(double retailprice) {
		this.retailprice = retailprice;
	}
	//to String
	public String toString() {
		return "CellPhone [manufacture=" + manufacture + ", model=" + model
				+ ", retailprice=" + retailprice + "]";
	}
	

}
