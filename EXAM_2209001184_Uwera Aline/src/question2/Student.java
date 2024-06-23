package question2;

import java.io.Serializable;

//public class Student {


	public class Student implements Serializable {
		private int id;
		private String name;
		private String grade;
		private int feespaid;
		private int feestotal;
		
		

		public Student(int id, String Name, int feestotal, int age, String grade, int feespaid) {
			this.id = id;
			this.name = Name;
			
			this.grade = grade;
			this.feespaid= feespaid;
			this.feestotal = feestotal;
		}

		public int getId() { return id; }
		public void setId(int id) { this.id = id; }

		public String Name() { return name; }
		public void setName(String Name) { this.name = Name; }

		public String getgrade() { return getgrade(); }
		public void setgrade(String grade) { this.grade = grade; }

		public int getfeespaid() { return feespaid; }
		public void setfeespaid(int age) { this.feespaid = feespaid; }

		public int getfeestotal() { return feestotal; }
		public void setfeestotal(int feestotal) { this.feestotal = feestotal; }

		
		@Override
		public String toString() {
			return "Student{" +
					"id=" + id +
					", Name='" + name + '\'' +
					", grade='" + grade + '\'' +
					", feespaid=" + feespaid +
					", feestotal='" + feestotal+ '\'' +
					'}';
		}
	

	
	public static void main(String[] args) {
	

	}

}
