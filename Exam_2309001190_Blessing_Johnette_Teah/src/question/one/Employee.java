package question.one;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

//Blessing Johnette Teah

public class Employee {
	
	//fields
	private int id;
	private String name;
	private String position;
	
	//getters and setters
	
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
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	//inserting data in the database
	public void insertDataIntoDatabase() {
		String host="jdbc:mysql://localhost/employee1";//_db";
		String user="root";
		String password="";
		String sql= "INSERT INTO employee VALUES (?,?,?)";
		try(
				Connection con=(Connection) DriverManager.getConnection(host,user,password);
				PreparedStatement stm=con.prepareStatement(sql);
				)
		{	
			stm.setInt(1, this.id);
			stm.setString(2, this.name);
			stm.setString(3,   this.position);
			
			int rowsAffected=stm.executeUpdate();
			if(rowsAffected> 0) {
				System.out.println("Data inserted successfully!");
				JOptionPane.showMessageDialog(null, 
						"Data inserted successfully!","After insert",
						JOptionPane.INFORMATION_MESSAGE);
			}else {
				System.out.println("Failed to insert data!");
				JOptionPane.showMessageDialog(null, 
						"Failed to insert data.!","After insert",
						JOptionPane.ERROR_MESSAGE);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//view
	public void view(int newid) {
		// connecting database
		String host="jdbc:mysql://localhost/employee1";//employee_db";
		String user="root";
		String password="";

		//sql statement
		String sql = "SELECT * FROM employee WHERE id = ?";

		try (
				//connect database
				Connection connection = (Connection) DriverManager.getConnection(host, user, password);

				// sql
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				) {
			
			preparedStatement.setInt(1, newid);

			// result
			ResultSet resultSet = preparedStatement.executeQuery();

			
			while (resultSet.next()) {
				this.setId(resultSet.getInt("id"));
				this.setName(resultSet.getString("name"));
				System.out.println("this is your information"+this.getId()+" "+this.getName()+" "+this.getPosition());
				JOptionPane.showMessageDialog(null,"this is your information,"+this.getId()+" "+this.getName()+" "+this.getPosition(),"OutPut", JOptionPane.INFORMATION_MESSAGE);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//update
	public void update(int newid) {
		//jdbc
		String host="jdbc:mysql://localhost/employee1";//employee_db";
		String user="root";
		String password="";
		String sql = "UPDATE employee SET name = ? WHERE id = ?";

		try (
				// connection
				Connection con = (Connection) DriverManager.getConnection(host, user, password);

				
				PreparedStatement stm = con.prepareStatement(sql);
				) {
			
			stm.setString(1, this.getName());
			stm.setString(2, this.getPosition());
			
			stm.setInt(3, newid);
			// Execute the update
			int rowsAffected = stm.executeUpdate();

			// Check the result
			if (rowsAffected > 0) {
				System.out.println("Data updated successfully!");
				JOptionPane.showMessageDialog(null,"Data updated successfully!","finish update", JOptionPane.INFORMATION_MESSAGE);

				
			} else {
				System.out.println("Failed to update information not data found.");
				JOptionPane.showMessageDialog(null,"Failed to update data. No matching record found.","After update", JOptionPane.INFORMATION_MESSAGE);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}   
	}
	
	//delete
	public void delete(int newid) {
		
		String host="jdbc:mysql://localhost/employee1";//employee_db";
		String user="root";
		String password="";

	    
	    String sql = "DELETE FROM employee WHERE id = ?";

	    try (
	      
	        Connection con = (Connection) DriverManager.getConnection(host, user, password);
	        PreparedStatement stm = con.prepareStatement(sql);
	    ) {
	       
	        stm.setInt(1, newid); 

	        // delete
	        int rowsAffected = stm.executeUpdate();

	        //result
	        if (rowsAffected > 0) {
	            System.out.println("Data deleted successfully!");
				JOptionPane.showMessageDialog(null,"Data deleted successfully!","Finish delete", JOptionPane.INFORMATION_MESSAGE);

	        } else {
	            System.out.println("Failed to delete data. nothing is there found.");
				JOptionPane.showMessageDialog(null,"Failed to delete data. No matching data found","finish delete", JOptionPane.INFORMATION_MESSAGE);

	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

}
