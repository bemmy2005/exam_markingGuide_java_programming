package question.five;

public class CellPhone {
	private String manufact;
	private String model;
	private double retailPrice;

	// Constructor
	public CellPhone(String manufact, String model, double retailPrice) {
		this.manufact = manufact;
		this.model = model;
		this.retailPrice = retailPrice;
	}

	// Setters
	public void setManufact(String manufact) {
		this.manufact = manufact;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	// Getters
	public String getManufact() {
		return manufact;
	}

	public String getModel() {
		return model;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public static void main(String[] args) {
		CellPhone phone = new CellPhone("Apple", "iPhone 12", 999.99);
		System.out.println("Manufacturer: " + phone.getManufact());
		System.out.println("Model: " + phone.getModel());
		System.out.println("Retail Price: " + phone.getRetailPrice());

		phone.setManufact("Samsung");
		phone.setModel("Galaxy S21");
		phone.setRetailPrice(799.99);
		System.out.println("Updated Manufacturer: " + phone.getManufact());
		System.out.println("Updated Model: " + phone.getModel());
		System.out.println("Updated Retail Price: " + phone.getRetailPrice());
	}
}
