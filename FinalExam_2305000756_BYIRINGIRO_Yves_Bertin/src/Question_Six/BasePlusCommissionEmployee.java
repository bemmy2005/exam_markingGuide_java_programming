package Question_Six;

public class BasePlusCommissionEmployee extends Employee{
	double Base;

	public void setBase(double base) {
		Base = base;
	}
	@Override
	public void displayAllDetails() {
	}
	@Override
	public void displayEarnings() {
	}
	@Override
	public double earning() {
		// TODO Auto-generated method stub
		return Base + earning();
	}
}
