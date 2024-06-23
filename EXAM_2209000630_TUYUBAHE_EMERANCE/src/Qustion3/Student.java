package Qustion3;
import java.io.Serializable;

public class Student implements Serializable {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String address;
	private String telephone;

	public Student(int id, String firstName, String lastName, int age, String address, String telephone) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.telephone = telephone;
	}

	public int getId() { return id; }
	public void setId(int id) { this.id = id; }

	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) { this.firstName = firstName; }

	public String getLastName() { return lastName; }
	public void setLastName(String lastName) { this.lastName = lastName; }

	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }

	public String getAddress() { return address; }
	public void setAddress(String address) { this.address = address; }

	public String getTelephone() { return telephone; }
	public void setTelephone(String telephone) { this.telephone = telephone; }

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", age=" + age +
				", address='" + address + '\'' +
				", telephone='" + telephone + '\'' +
				'}';
	}
}

