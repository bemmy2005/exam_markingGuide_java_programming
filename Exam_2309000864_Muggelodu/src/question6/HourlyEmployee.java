package question6;
	public class HourlyEmployee extends Employee {
		private double hourlyWage;
		private int hoursWorked;

		public HourlyEmployee(String name, int socialSecurityNumber, String address,
				double hourlyWage, int hoursWorked) {
			super(name, socialSecurityNumber, address);
			this.hourlyWage = hourlyWage;
			this.hoursWorked = hoursWorked;
		}

		@Override
		public double calculateEarnings() {
			return hourlyWage * hoursWorked;
		}

		public double getHourlyWage() {
			return 20.0;
		}

		public int getHoursWorked() {
		    return 40;
		}
	}

