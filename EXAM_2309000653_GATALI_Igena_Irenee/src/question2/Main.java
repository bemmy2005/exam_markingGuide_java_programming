package question2;

	import java.util.ArrayList; 
	import java.util.List; 
	 
	public class Main{ 
	    public static void main(String[] args) { 
	        List<Teacher> Teacherlist = new ArrayList<>(); 
	        Teacherlist.add(null);
	        Teacherlist.add(null);
	        Teacher Teacher1=new Teacher(1,"alice",5000);
	        Teacher Teacher2=new Teacher(2,"Bob",7000);
	        List<Teacher> Studentlist = new ArrayList<>(); 
	        Studentlist.add(null);
	        Studentlist.add(null);
	        Student Student1=new Student(1,"Charlie",4);
	        Student Student2=new Student(2,"David",12);
	 
	        for (Teacher Teacher : Teacherlist) { 
	            System.out.println(Teacher.getId() + "  "+Teacher.getName()+" " + Teacher.getSalary() + ""); 
	         for (Teacher Student : Studentlist) { 
		         System.out.println(Student.getId() + "  "+Student.getName()+" " + Student.getGrade() + ""); 
	        } 
	    }

		
	    }
	}


