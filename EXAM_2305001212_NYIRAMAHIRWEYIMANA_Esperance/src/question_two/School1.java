package question_two;
import java.util.ArrayList;
//your reg number is wrong 2305001214, but on this project it is 2305001212
public class School1 {
	private ArrayList<Teacher> teachers;
	private ArrayList<Student> Students;
	private static int totalmoneyearned;
	private static int totalmoneyspent;
	public static String gettotalmoneyearned;
	public School1(ArrayList<Teacher> teachers, ArrayList<Student> students) {
		super();
		this.teachers = teachers;
		Students = students;
	}
	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(ArrayList<Teacher> teachers) {
		this.teachers = teachers;
	}
	public ArrayList<Student> getStudents() {
		return Students;
	}
		public void setStudents(ArrayList<Student> students) {
			Students = students;	
		
	}//add element to the list
	public void addTeacher(Teacher teacher){
		this.teachers.add(teacher);
	}
	public void addstudent(Student student){
		this.Students.add(student);
		
	}
	//update
	public static void updatetotalmoneyearned(int moneyearned){
		totalmoneyearned=+ totalmoneyearned; 
	}
		public static void updatetotalmoneyspent(int moneyspent){
			totalmoneyearned=+ totalmoneyearned;
		}
	
	public static int getTotalmoneyearned() {
		return totalmoneyearned;
	}
	public static void setTotalmoneyearned(int totalmoneyearned) {
		School1.totalmoneyearned = totalmoneyearned;
	}
	public static int getTotalmoneyspent() {
		return totalmoneyspent;
	}
	public static void setTotalmoneyspent(int totalmoneyspent) {
		School1.totalmoneyspent = totalmoneyspent;
	}
	public static void main(String[]args){
		School1 s1= School("s1");
	}
	private static School1 School(String string) {
		// TODO Auto-generated method stub
		return null;
	}
} 
	
	

	




