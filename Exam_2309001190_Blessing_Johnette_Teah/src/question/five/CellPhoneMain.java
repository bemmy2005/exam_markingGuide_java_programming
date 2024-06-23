package question.five;

public class CellPhoneMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CellPhone cell = new CellPhone();
		cell.setManufac("Apple");
		cell.getManufac();
		cell.setModel("IPhone");
		cell.getModel();
		cell.setRetailPrice(200000);
		cell.getRetailPrice();
		
		System.out.println(cell.toString());
		
	}

}
