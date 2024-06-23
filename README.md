SECTION A
QUESTION ONE (COMPULSORY)
Write a Java program that creates a graphical user interface (GUI) application to manage employee records with three fields, and integrates this GUI with a database. The program should include the following components and functionalities:
Instructions:
1.	Create an Employee Class:
Define a class Employee with three private fields (id, name, and position).
Implement setters and getters for each field.
2.	Create a GUI Class:
Define a class GUIEmployee that extends JFrame.
Add three JLabels and three JTextFields to the GUIEmployee class, each corresponding to the fields of Employee.
Add four JButtons labeled Insert, View, Update, and Delete to the GUI.
Arrange the components using a suitable layout manager.
3.	Database Setup:
Create a database (e.g., SQLite or MySQL) to store employees with the same fields as Employee.
Establish a connection to the database from your Java application using JDBC.
4.	GUI and Database Integration:
Implement the functionality to insert, view, update, and delete records in the database using the buttons in the GUI.
Connect the setters and getters of Employee with the text fields in GUIEmployee.
Use the Insert button to save the data from the text fields into the database.
Use the View button to retrieve and display the data from the database into the text fields.
Use the Update button to modify the existing record in the database based on the data in the text fields.
Use the Delete button to remove the record from the database.


SECTION B (Select three questions)
QUESTION TWO
 
Using the diagram above, write a Java program to model a basic school management system. Your program should consist of the following classes: `Student`, `Teacher`, `School`, and a `Main` class to test your implementation.
First, create the `Student` class with attributes (`id`, `name`, `grade`, `feesPaid` initialized to 0, and `feesTotal` set to 30000). Implement a constructor to initialize `id`, `name`, and `grade`, while setting `feesPaid` to 0 and `feesTotal` to 30000. Provide getters and setters for each attribute, and add a method `payFees(int amount)` that increments `feesPaid` by the given amount and updates the school's total money earned.
Next, create the `Teacher` class with attributes (`id`, `name`, `salary`, and `salaryEarned` initialized to 0). Implement a constructor to initialize `id`, `name`, and `salary`. Provide getters and setters for each attribute, and add a method `receiveSalary(int salary)` that increments `salaryEarned` by the given amount and updates the school's total money spent.
Then, create the `School` class with attributes (`teachers` as a list of `Teacher`, `students` as a list of `Student`, `totalMoneyEarned` initialized to 0, and `totalMoneySpent` initialized to 0). Implement a constructor to initialize the lists of `teachers` and `students`. Provide getters and setters for each attribute, and add methods `addTeacher(Teacher teacher)` to add a teacher to the `teachers` list, `addStudent(Student student)` to add a student to the `students` list, `updateTotalMoneySpent(int money)` to increment `totalMoneySpent` by the given amount, and `updateTotalMoneyEarned(int money)` to increment `totalMoneyEarned` by the given amount.
Finally, in the `Main` class, instantiate objects of `Teacher` and `Student`. Add these objects to the lists in the `School` object. Perform actions such as paying fees and receiving salaries. Display the final state of the school's total money earned and spent. For example, instantiate `Teacher` objects (`teacher1` with `id` 1, `name` Alice, `salary` 5000 and `teacher2` with `id` 2, `name` Bob, `salary` 7000), and `Student` objects (`student1` with `id` 1, `name` Charlie, `grade` 4 and `student2` with `id` 2, `name` David, `grade` 12). Add these teachers and students to the `School` object, make the students pay fees, and make the teachers receive salaries. Finally, print the total money earned and spent by the school.
NB. The main method is implemented for you, it can be found in the appendix of this questionnaire
QUESTION THREE
Write a Java program that creates an applet-based graphical user interface (GUI) application to manage teacher records, and integrates this GUI with a database. The program should include the following components and functionalities:
Instructions:
1.	Create a Teacher Class:
Define a class Teacher with three private fields (id, name, and subject).
Implement setters and getters for each field.
2.	Create an Applet Class: Define a class TeacherApplet that extends Applet. Add three Labels and three TextFields to the TeacherApplet class, each corresponding to the fields of Teacher. Add four Buttons labeled Insert, View, Update, and Delete to the GUI. Arrange the components using a suitable layout manager.
3.	Database Setup: Create a database (e.g., SQLite or MySQL) to store teacher records with the same fields as Teacher. Establish a connection to the database from your Java application using JDBC.
4.	GUI and Database Integration: Implement the functionality to insert, view, update, and delete records in the database using the buttons in the GUI. Connect the setters and getters of Teacher with the text fields in TeacherApplet. Use the Insert button to save the data from the text fields into the database. Use the View button to retrieve and display the data from the database into the text fields. Use the Update button to modify the existing record in the database based on the data in the text fields. Use the Delete button to remove the record from the database.

Implement the Teacher class with three fields (id, name, and subject), along with their getters and setters. Create the TeacherApplet class with labels, text fields, and buttons as described. Set up a database and ensure your program can connect to it using JDBC. Link the GUI components to the database actions through appropriate button event handlers. Test the application thoroughly to ensure all operations (insert, view, update, delete) work as expected.    
 QUESTION FOUR
 Write a Java application following the Object-Oriented Programming (OOP) paradigm that performs file operations. The application should create a file named myfile.txt, take user input (name and age) from the keyboard, append this input to the file, allow for multiple entries, save the file, and read the content of the file back to the user.
Instructions:
1.	Create a Person Class:
Define a class Person with private fields name and age, Implement getters and setters for each field, Override the toString method to format the person's information for writing to the file.
2.	Create a FileManager Class:
Define a class FileManager with methods for file operations.
Implement methods to: Create a file (createFile) and write user input to the file (writeToFile), Append multiple entries to the file. Read and display the file content (readFromFile).
3.	Create a Main Class: Define a class Main with the main method. Instantiate objects of Person and FileManager. Prompt the user to input their name and age, and handle these inputs. Use the FileManager methods to write and read data from the file. Allow for multiple entries by using a loop.
QUESTION FIVE
Implement the objects below and their main classes.
  QUESTION FIVE
Implement the inheritance below by respecting the class type and finally implement their main methods.
 
