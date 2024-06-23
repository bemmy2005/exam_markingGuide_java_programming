package Question_Four;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
public class PersonFileHandler {
	public static void writepersonToFile(List<Person> person, String FileManager) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FileManager))) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Person> readpersonFromFile(String FileManager) {
        List<Person> person = new ArrayList<>();
        try (ObjectInputStream OiS = new ObjectInputStream(new FileInputStream(FileManager))) {
            person = (List<Person>) OiS.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return person;
    }

    public static void main(String[] args) {
        // Create instances of person
        Person s1 = new  Person(1, "Kalisa");
        Person s2 = new  Person(2, "Keza");
        Person s3 = new  Person(3, "Kamali");

        // Add person to a list
        List< Person> person = new ArrayList<>();
        person.add(s1);
        person.add(s2);
        person.add(s3);

        // Write person to a file
        String FileManager = "person.txt";
        writepersonToFile(person, FileManager);

        // Read person from the file
        List< Person> readperson = readpersonFromFile(FileManager);

        // Display the person read from the file
        for ( Person persons : readperson) {
            System.out.println(person);
        }
    }
}
