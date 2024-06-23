package question5;
public class Author {
		private String id;
		private String name;
		private double salary;
		private double royaltiesEarned;

		// Constructor
		public Author(String id, String name, double salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.royaltiesEarned = 0;
		}

		// Getters and Setters
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public double getRoyaltiesEarned() {
			return royaltiesEarned;
		}

		public void setRoyaltiesEarned(double royaltiesEarned) {
			this.royaltiesEarned = royaltiesEarned;
		}

		// Method to receive royalties
		public void receiveRoyalties(double amount) {
			this.royaltiesEarned += amount;
		}
	}

