	package questiontwo;
	
	import java.util.ArrayList;
	
	public class School {
		private ArrayList<Teacher> teachers;
		private ArrayList<Student> students;
		private static int totalMoneyEarned;
		private static int totalMoneySpent;
		
		public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
			super();
			this.teachers = teachers;
			this.students = students;
			totalMoneyEarned= 0;
			totalMoneySpent= 0;
		}
	
		public ArrayList<Teacher> getTeachers() {
			return teachers;
		}
	
		public void setTeachers(ArrayList<Teacher> teachers) {
			this.teachers = teachers;
		}
		
		public ArrayList<Student> getStudents() {
			return students;
		}
		
		//add element to the list
		
		public void setStudents(ArrayList<Student> students) {
			this.students = students;
		}
		public void addTeacher(Teacher teacher) {
			this.teachers.add(teacher);
		}
		public void addStudent(Student student) {
			this.students.add(student);
		}
		
		//update
		
		 public static void updateTotalMoneyEarned(int moneyEarned){
			 totalMoneyEarned += moneyEarned;
			 }
		 public static void updateTotalMoneySpent(int moneySpent){
		 totalMoneySpent +=moneySpent;
		 }
	
		 public static int getTotalMoneyEarned() {
		return totalMoneyEarned;
		 }
	
	public static int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	 
	}
	
