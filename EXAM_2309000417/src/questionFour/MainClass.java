package questionFour;

import java.util.Scanner;

public class MainClass {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        FileManager fileManager = new FileManager();
	        fileManager.createFile();

	        char choice;
	        do {
	            System.out.print("Enter name: ");
	            String name = scanner.nextLine();
	            System.out.print("Enter age: ");
	            int age = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            Person person = new Person(name, age);
	            fileManager.writeToFile(person);

	            System.out.print("Do you want to enter another person's information? (Y/N): ");
	            choice = scanner.nextLine().charAt(0);
	        } while (choice == 'Y' || choice == 'y');

	        System.out.println("File content:");
	        fileManager.readFromFile();

	        scanner.close();
	    }

}
