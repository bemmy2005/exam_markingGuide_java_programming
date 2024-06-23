package question5;

public class CellPhone {

		
		String manufact;
		String model;
		double retailprice;
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
		public double getPrice() {
			return retailprice;
		}
		public void setPrice(double price) {
			this.retailprice = price;
		}
		public String toString() {
			return "CellPhone [manufact=" + manufact + ", model=" + model
					+ ", price=" + retailprice + "]";
		}
		
		
}
