
package questionone;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class GUIEmployee extends JFrame implements ActionListener  {
	
	 // Database connection details
    private static final String URL = "jdbc:mysql://localhost:3306/employee";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    //
	private JFrame frame;
	//labels
	private JLabel id_lb=new JLabel("id");
	private JLabel name_lb=new JLabel("Name");
	private JLabel position_lb=new JLabel("position");
	
	//textfields
	private JTextField id_tf =new JTextField("");
	private JTextField name_tf=new JTextField("");
	private JTextField position_tf=new JTextField("");

	
	//Buttons
	private JButton insert_btn=new JButton("insert");
	private JButton view_btn=new JButton("view");
	private JButton update_btn=new JButton("Update");
	private JButton delete_btn=new JButton("Delete");
	
	//constructor
	public GUIEmployee(){
		insertWindow();
		setLocationAndSize();
		addActionEvent();
		addComponentsToFrame();
	}

	private void addComponentsToFrame() {
		frame.add(id_lb);
		frame.add(name_lb);
		frame.add(position_lb);
		frame.add(id_tf);
		frame.add(name_tf);
		frame.add(position_tf);
		frame.add(insert_btn);
		frame.add(update_btn);
		frame.add(view_btn);
		frame.add(delete_btn);
		
		}
private void addActionEvent() {
		insert_btn.addActionListener(this);
		view_btn.addActionListener(this);
		update_btn.addActionListener(this);
		delete_btn.addActionListener(this);
	}
private void setLocationAndSize() {
		id_lb.setBounds(10,10,80,25);
		name_lb.setBounds(10,40,80,25);
		position_lb.setBounds(10,70,80,25);
		
		id_tf.setBounds(160,10,200,25);
		name_tf.setBounds(160,40,200,25);
		position_tf.setBounds(160,70,200,25);
		
		insert_btn.setBounds(10,130,80,25);
		update_btn.setBounds(190,130,80,25);
		view_btn.setBounds(100,130,80,25);
		delete_btn.setBounds(280,130,80,25);
		}

	private void insertWindow() {
	frame=new JFrame();
	frame.setTitle("");
	frame.setBounds(20, 20, 400,300);
	frame.getContentPane().setBackground(Color.GRAY);
	frame.getContentPane().setLayout(null);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(true);
	
		
	}
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == insert_btn) {
            insertEmployee();
        } else if (e.getSource() == view_btn) {
            viewEmployee();
        } else if (e.getSource() == update_btn) {
            updateEmployee();
        } else if (e.getSource() == delete_btn) {
            deleteEmployee();
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
private void insertEmployee() {
        String query = "INSERT employee(ID,title,position) VALUES (?, ?, ?)";
          JOptionPane.showMessageDialog(this, "Employee inserted successfully!"); }
private void viewEmployee() {
        String query = "VIEW * FROM Employee WHERE id = ?";
           JOptionPane.showMessageDialog(this, "Employee found!");
            }
    private void updateEmployee() {
          String query = "UPDATE Employee SET name = ?, id = ?, position = ?";
          JOptionPane.showMessageDialog(this, "Employee updated successfully!");
        }
 private void deleteEmployee() {
     String query = "DELETE FROM Employee WHERE id = ?";
     JOptionPane.showMessageDialog(this, "Employee deleted successfully!");
   }
	public static void main(String[] args){
		GUIEmployee GE=new GUIEmployee();
	}
}
