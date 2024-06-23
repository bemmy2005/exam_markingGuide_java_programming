//Kwizera remy
//2205000689
package quesion.four;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager();
        String fileName = "persons.txt";

        fileManager.createFile(fileName);

        boolean continueInput = true;

        while (continueInput) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());

            Person person = new Person(name, age);
            fileManager.appendToFile(fileName, person.toString());

            System.out.print("Do you want to add another person? (yes/no): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("no")) {
                continueInput = false;
            }
        }

        System.out.println("Contents of the file:");
        fileManager.readFile(fileName);

        scanner.close();
    }
}
