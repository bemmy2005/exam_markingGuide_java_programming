package Question_One;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;
public class GUIEmployee implements ActionListener{
	JFrame frame=new JFrame();
	JLabel Id_lb=new JLabel("Id:");
	JLabel Name_lb=new JLabel("Name:");
	JLabel Position_lb=new JLabel("Position:");

	JTextField Id_tf=new JTextField();
	JTextField Name_tf=new JTextField();
	JTextField Position_tf=new JTextField();

	JButton Insert_btn=new JButton("Insert");
	JButton Reset_btn=new JButton("Reset");
	JButton Update_btn=new JButton("Update");
	JButton Delete_btn=new JButton("Delete");

	public GUIEmployee(){
		createWindow();
		setLocationAndSize();
		addComponentsToFrame();
		addActionEvent();
	}

	private void addActionEvent() {
		Id_tf.addActionListener(this);
		Name_tf.addActionListener(this);
		Position_tf.addActionListener(this);
		Insert_btn.addActionListener(this);
		Reset_btn.addActionListener(this);
		Update_btn.addActionListener(this);
		Delete_btn.addActionListener(this);
	}

	private void addComponentsToFrame() {
		frame.add(Id_lb);
		frame.add(Name_lb);
		frame.add(Position_lb);
		frame.add(Id_tf);
		frame.add(Name_tf);
		frame.add(Position_tf);
		frame.add(Insert_btn);
		frame.add(Reset_btn);
		frame.add(Update_btn);
		frame.add(Delete_btn);
	}
	private void setLocationAndSize() {
		Id_lb.setBounds(20, 20, 100, 20);
		Name_lb.setBounds(20,70, 100, 20);
		Position_lb.setBounds(20,120, 100, 20);

		Id_tf.setBounds(180, 20, 100, 20);
		Name_tf.setBounds(180, 70, 100, 20);
		Position_tf.setBounds(180,120, 100, 20);

		Insert_btn.setBounds(30,200,100,30);
		Reset_btn.setBounds(150,200,100,30);
		Update_btn.setBounds(270,200,100,30);
		Delete_btn.setBounds(390,200,100,30);
	}
	private void createWindow() {
		frame=new JFrame();
		frame.setTitle("GUI Employee");
		frame.setBounds(20,20,500,500);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Insert_btn) {
			//private void insertIntoDatabase(String Id, String Name, String Position) {
			try {
				// Establish connection to the database
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
				// Create the SQL query
				String sql = "INSERT INTO Employee (Id, Name, Position) VALUES (?, ?, ?)";
				// Prepare the statement
				PreparedStatement stmt = conn.prepareStatement(sql);
				// Set the parameters
				stmt.setString(1, sql);
				stmt.setString(2, sql);
				stmt.setString(3, sql);
				// Execute the query
				stmt.executeUpdate();
				// Close connection
				conn.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}else if(e.getSource()==Delete_btn) {
			Id_tf.setText("");
			Name_tf.setText("");
			Position_tf.setText("");	
		}else if(e.getSource()==Update_btn) {
				
		}
	}
}
