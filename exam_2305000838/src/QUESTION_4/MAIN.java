package QUESTION_4;

import java.util.Scanner;

public class MAIN {
	private static filemanger object;

	public static <filemanager> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       filemanger fileManager = new filemanger("myfile.txt");

        

        // Prompt user for input and write to file
        boolean continueInput = true;
        while (continueInput) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());

            person person = new person();
            ((filemanger) fileManager).writeToFile(person);

            System.out.print("Do you want to enter another person? (yes/no): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                continueInput = false;
            }
        }

        // Read and display file content
        System.out.println("\nFile content:");
        ((filemanger) fileManager).readFromFile();

        scanner.close();
    }

	public static filemanger getObject() {
		return object;
	}

	public static void setObject(filemanger object) {
		MAIN.object = object;
	}

}
