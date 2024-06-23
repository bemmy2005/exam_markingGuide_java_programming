//Pascaline  Shimwa 2305000057
package question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class Employee {
	
private int id;
private String name;
private String Position;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPosition() {
	return Position;
}
public void setPosition(String position) {
	Position = position;
}

public void insertDataIntoDatabase(){
	String host="jdbc:mysql://localhost/employee1";
	String user="root";
	String password="";
	String sql="INSERT INTO employee1(id,name,position)VALUES(?,?,?)";
	try(
		Connection con=DriverManager.getConnection(host,user,password);
		PreparedStatement stm=con.prepareStatement(sql);
			)
			{
		stm.setInt(1,this.id);
		stm.setString(2,this.name);
		stm.setString(3,this.Position);
		int rowsAffected=stm.executeUpdate();
		if(rowsAffected>0){
			System.out.println("Data inserted successfully!");
			JOptionPane.showMessageDialog(null,"data inserted successfully","After insert",JOptionPane.INFORMATION_MESSAGE);
		}else{
			System.out.println("Failed to insert data!");
			JOptionPane.showMessageDialog(null,"failed to insert data","After insert",JOptionPane.ERROR_MESSAGE);
		}
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
