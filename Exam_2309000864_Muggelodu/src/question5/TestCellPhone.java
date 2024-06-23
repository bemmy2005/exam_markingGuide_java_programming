package question5;

	public class TestCellPhone {

		public static void main(String[] args) {
			//Create a new Cell_phone Objects 
			CellPhone  myPhone = new CellPhone();

			//Set the manufacture, model and retail_price
			myPhone.setManufact("Apple");
			myPhone.setModel("15pro MAX");
			myPhone.setRetailprice(1799.29);

			//Get and display the information 
			System.out.println("The Manufacture : "+ myPhone.getManufact());
			System.out.println("The Model : "+ myPhone.getModel());
			System.out.println("The Retail Price : $"+ myPhone.getRetailprice());

		}

	}

