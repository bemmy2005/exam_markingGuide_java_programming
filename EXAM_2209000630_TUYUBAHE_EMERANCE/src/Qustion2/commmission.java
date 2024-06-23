package Qustion2;

public class commmission {
	 
	 public class CommissionEmployee extends Employee {
	     private double grossSales;
	     private double commissionRate;

	     public void setGrossSales(double sales) {
	         this.grossSales = sales;
	     }

	     public void setCommissionRate(double rate) {
	         this.commissionRate = rate;
	     }

	     @Override
	     public double earning() {
	         return grossSales * commissionRate;
	     }

		public void setBase(double d) {
			// TODO Auto-generated method stub
			
		}
	 }



}
