package questiontwo;

import java.util.List;

public class School {
private String teacherlist[] ;
private String studentlist[];
private int totalMoneyEarned=0;
private int totalMoneySpent=0;
School(String[] teacherList, String[] studentList) {
	super();
	this.teacherlist = teacherList;
	this.studentlist = studentList;
}
public School(List<Teacher> teacherList, List<Student> studentList) {
	// TODO Auto-generated constructor stub
}
public String[] getteacherslist() {
	return teacherlist;
}
public void setteacherslist(String[] teacherslist) {
	this.teacherlist = teacherslist;
}
public String[] getstudentlist() {
	return studentlist;
}
public void setstudentlist(String[] studentlist) {
	this.studentlist = studentlist;
}
public int getTotalMoneyEarned() {
	return totalMoneyEarned;
}
public void setTotalMoneyEarned(int totalMoneyEarned) {
	this.totalMoneyEarned = totalMoneyEarned;
}
public int getTotalMoneySpent() {
	return totalMoneySpent;
}
public void setTotalMoneySpent(int totalMoneySpent) {
	this.totalMoneySpent = totalMoneySpent;
}
public static String addTeacher(Teacher teacher){
	return null;

}
public static String addStudent(Student student){
	return null;
	
}
public static int updateTotalMoneySpent(int money){
	return (money);
	
}
public static int updateTotalMoneyEarned(int money){
	return money;
	}
}