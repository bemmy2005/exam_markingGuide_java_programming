package question6;
	 public abstract class Employee {
	    private String name;
	    private int ssn;
	    private String address;

	    public Employee(String name, int ssn, String address) {
	        this.name = name;
	        this.ssn = ssn;
	        this.address = address;
	    }

	    

	    public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public int getSsn() {
			return ssn;
		}



		public void setSsn(int ssn) {
			this.ssn = ssn;
		}



		public String getAddress() {
			return address;
		}



		public void setAddress(String address) {
			this.address = address;
		}



		public abstract double earnings();

	    public abstract void displayDetails();
	}



