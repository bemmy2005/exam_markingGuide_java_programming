//Nyirabaziga ituze merveille 2301000975
 



package QuestionSix;

public class SalariedEmployee extends Employee{
	
	double salary;
	double bonus;
	double deductions;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getDeductions() {
		return deductions;
	}
	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	public void setSnn(int snn) {
		// TODO Auto-generated method stub
		super.setSnn(snn);
	}
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		super.setAddress(address);
	}
	public void setCompname(String compname) {
		// TODO Auto-generated method stub
		super.setCompname(compname);
	}
	public void setFax(String fax) {
		// TODO Auto-generated method stub
		super.setFax(fax);
	}
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", bonus=" + bonus
				+ ", deductions=" + deductions + ", getCompname()="
				+ getCompname() + ", getFax()=" + getFax() + ", getName()="
				+ getName() + ", getSnn()=" + getSnn() + ", getAddress()="
				+ getAddress() + "]";
	}
	
	

}
