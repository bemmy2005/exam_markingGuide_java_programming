package Qustion2;

public class basisdplus {

	public class BasePlusCommissionEmployee extends CommissionEmployee {
	    private double base;

	    public void setBase(double base) {
	        this.base = base;
	    }

	    public double earning() {
	        return base + super.earning();
	    }

		public void setName(String string) {
			// TODO Auto-generated method stub
			
		}

		public void setSSN(int i) {
			// TODO Auto-generated method stub
			
		}
	}


}
