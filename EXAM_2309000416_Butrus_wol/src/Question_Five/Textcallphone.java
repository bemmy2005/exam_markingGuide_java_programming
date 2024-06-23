package Question_Five;

public class Textcallphone {

public class testcallPhone {
	public void main(String[] args) {
		callphone myPhone = new callphone("Apple","iPhone 15",999.99);
		
		System.out.println("manufacturer:"+ myPhone.getManufact());
		System.out.println("model:"+ myPhone.getModel());
		System.out.println("Retail price:"+ myPhone.getRetailprice());
		
		myPhone.setmanufact("Samsung");
		myPhone.setmodel("Galaxy S21");
		myPhone.setRetailprice(80000);
		
		System.out.println("Updated manufacturer:"+myPhone.getManufact());
		System.out.println("Updated model:"+myPhone.getModel());
		System.out.println("Updated Retail price:$"+myPhone.getRetailprice());
		
	}
}


}



//Butrus_wol
//2309000416
