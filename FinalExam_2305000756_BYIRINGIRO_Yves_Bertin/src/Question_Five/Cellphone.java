package Question_Five;
public class Cellphone {
	String Manufact;
	String Model;
	double RetailPrice;
	public String getManufact() {
		return Manufact;
	}
	public void setManufact(String Manufact) {
		this.Manufact = Manufact;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String Model) {
		this.Model = Model;
	}
	public double getRetailPrice() {
		return RetailPrice;
	}
	public void setRetailPrice(double RetailPrice) {
		this.RetailPrice = RetailPrice;
	}
	public String toString() {
		return "Cellphone [Manufact=" + Manufact + ", Model=" + Model
				+ ", RetailPrice=" + RetailPrice + "]";
	}
}