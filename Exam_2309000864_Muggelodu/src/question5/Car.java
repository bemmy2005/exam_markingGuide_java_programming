package question5;

	public class Car {
		String Make;
		int yearmodel;
		
		public String getMake() {
			return Make;
		}
		public void setMake(String make) {
			Make = make;
		}
		public int getYearmodel() {
			return yearmodel;
		}
		public void setYearmodel(int yearmodel) {
			this.yearmodel = yearmodel;
		}
		@Override
		public String toString() {
			return "Car [The Make = " + Make + ", year of model = " + yearmodel + "]";
		}
		
		
		
		


	}

