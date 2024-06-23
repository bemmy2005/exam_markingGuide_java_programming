package Qustion3;

	import java.io.*;
	import java.util.ArrayList;
	import java.util.List;

	public class StudentFileHandler {
	    
	    public static void writeStudentsToFile(List<Student> students, String filename) {
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
	            oos.writeObject(students);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static List<Student> readStudentsFromFile(String filename) {
	        List<Student> students = new ArrayList<>();
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
	            students = (List<Student>) ois.readObject();
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	        return students;
	    }

	    public static void main(String[] args) {
	        // Create instances of Student
	        Student s1 = new Student(1, "alise", "", 13, "123 Main St", "5000");
	        Student s2 = new Student(2, "bobo", "", 30, "", "700");
	        Student s3 = new Student(3, "davide", "", 12, "789 Pine St", "555-8765");

	        // Add students to a list
	        List<Student> students = new ArrayList<>();
	        students.add(s1);
	        students.add(s2);
	        students.add(s3);

	        // Write students to a file
	        String filename = "student.txt";
	        writeStudentsToFile(students, filename);

	        // Read students from the file
	        List<Student> readStudents = readStudentsFromFile(filename);

	        // Display the students read from the file
	        for (Student student : readStudents) {
	            System.out.println(student);
	        }
	    }
	}



