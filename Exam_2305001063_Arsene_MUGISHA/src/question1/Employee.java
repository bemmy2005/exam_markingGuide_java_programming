package question1;
/*Arsene MUGISHA
 * REG: 2305001063
 */
import java.sql.*;

import javax.swing.JOptionPane;


public class Employee {
	
	
	private String id;
	private String name;
	private String position;
	
	
public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

public void insertDataIntoDatabase(){
	String host="jdbc:mysql://localhost/SQLite";
	String user="root";
	String password="";
	String sql="INSERT INTO info(id,name,position)VALUES (?,?,?)";
	try(
			Connection con=DriverManager.getConnection(host,user,password);
			PreparedStatement stm=con.prepareStatement(sql);
			){
		stm.setString(1, this.id);
		stm.setString(2, this.name());
		stm.setString(2, this.position());
		int rows=stm.executeUpdate();
		if(rows>0){
			((Object) System.out).equals("data inserted succussifful");
			JOptionPane.showMessageDialog(null,"data inserted succussifful","after inserted",JOptionPane.INFORMATION_MESSAGE);

		}
		else{
			((Object) System.out).equals("data inserted failed");
			JOptionPane.showMessageDialog(null,"data inserted failed","after inserted",JOptionPane.ERROR_MESSAGE);


		}
	}catch(SQLException e){
		e.printStackTrace();


	
}
	
}

private String position() {
	// TODO Auto-generated method stub
	return null;
}

private String name() {
	// TODO Auto-generated method stub
	return null;
}


}
