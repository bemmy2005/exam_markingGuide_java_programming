package questionsix;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	 private double base;

	    public void setBase(double base) {
	        this.base = base;
	    }

	    @Override
	    public double earning() {
	        return base + super.earning();
	    }
	}


