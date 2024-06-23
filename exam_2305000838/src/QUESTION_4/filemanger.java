package QUESTION_4;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filemanger {
	  private String fileName;

	    public filemanger(String fileName) {
	        this.fileName = fileName;
	    }

	    // Method to create file
	    public void createFile() throws IOException {
	        file file = new file();
			if (file.createNewFile()) {
			    System.out.println("File created: " + file.getName());
			} else {
			    System.out.println("File already exists.");
			}
	    }

	    // Method to write user input to file
	    public void writeToFile(person person) {
	        try {
	            FileWriter writer = new FileWriter(fileName, true);
	            writer.write(person.toString() + "\n");
	            writer.close();
	            System.out.println("Successfully wrote to the file.");
	        } catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	        } finally {
			}
	    }

	    // Method to read and display file content
	    public void readFromFile() {
	        Scanner scanner = new Scanner(file());
			while (scanner.hasNextLine()) {
			    String line = scanner.nextLine();
			    System.out.println(line);
			}
			scanner.close();
	    }

		private Readable file() {
			// TODO Auto-generated method stub
			return null;
		}
}
