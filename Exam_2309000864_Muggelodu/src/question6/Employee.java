package question6;
	public abstract class Employee {
	    private String name;
	    private int socialSecurityNumber;
	    private String address;

	    public Employee(String name, int socialSecurityNumber, String address) {
	        this.name = name;
	        this.socialSecurityNumber = socialSecurityNumber;
	        this.address = address;
	    }

	    public abstract double calculateEarnings();

	    // Getters and setters for name, socialSecurityNumber, and address
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getSocialSecurityNumber() {
	        return socialSecurityNumber;
	    }

	    public void setSocialSecurityNumber(int socialSecurityNumber) {
	        this.socialSecurityNumber = socialSecurityNumber;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }
	}

