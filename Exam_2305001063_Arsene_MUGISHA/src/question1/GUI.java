package question1;
/*Arsene MUGISHA
 * REG: 2305001063
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

public class GUI implements ActionListener{
	// Labels
	private JFrame frame;
	private JLabel id_lb=new JLabel("ID");
	private JLabel name_lb=new JLabel("NAME");
	private JLabel position_lb=new JLabel("POSITION");
	// Textfields
	private JTextField id_tf=new JTextField();
	private JTextField name_tf=new JTextField();
	private JTextField position_tf=new JTextField();
	// Buttons
	private JButton insert_btn=new JButton("INSERT");
	private JButton view_btn=new JButton("VIEW");
	private JButton update_btn=new JButton("UPDATE");
	private JButton delete_btn=new JButton("DELETE");

	public GUI(){

		CreateWindow();
		SetLocationAndSize();
		AddComponentAndFrame();
		AddActionEvent();


	}

	private void AddActionEvent() {

		insert_btn.addActionListener(this);
		view_btn.addActionListener(this);
		update_btn.addActionListener(this);
		delete_btn.addActionListener(this);

	}

	private void AddComponentAndFrame() {

		frame.add(id_lb);
		frame.add(name_lb);
		frame.add(position_lb);
		frame.add(id_tf);
		frame.add(name_tf);
		frame.add(position_tf);
		frame.add(insert_btn);
		frame.add(view_btn);
		frame.add(update_btn);
		frame.add(delete_btn);

	}

	private void SetLocationAndSize() {

		id_lb.setBounds(30, 30, 110, 30);
		name_lb.setBounds(30, 70, 110, 30);
		position_lb.setBounds(30, 110, 110, 30);
		id_tf.setBounds(150, 30, 150, 30);
		name_tf.setBounds(150, 70, 150, 30);
		position_tf.setBounds(150, 110, 150, 30);
		insert_btn.setBounds(20, 160, 110, 30);
		view_btn.setBounds(130, 160, 110, 30);
		update_btn.setBounds(240, 160, 110, 30);
		delete_btn.setBounds(350, 160, 110, 30);

	}

	private void CreateWindow() {

		frame=new JFrame();
		frame.setTitle("GUIEmployee");
		frame.setBounds(30, 30, 500, 300);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);

	}

	public static void main(String[] e) {
		@SuppressWarnings("unused")
		GUI gf=new GUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		@SuppressWarnings("unused")
		GUI gf=new GUI();
		if(e.getSource()==view_btn){

			String id = id_tf.getText();
            String name = name_tf.getText();
            String position = position_tf.getText();
            displayEmployeeData(id, name, position);

		}
		if(e.getSource()==delete_btn){
			id_tf.setText(" ");
			name_tf.setText(" ");
			position_tf.setText(" ");


		}
		if(e.getSource()==update_btn){
			id_tf.setText(" ");
			name_tf.setText(" ");
			position_tf.setText(" ");	
		}
		if(e.getSource()==insert_btn){
			String db = "jdbc:mysql://localhost:3306/SQLite";
	        String username = "root";
	        String password = "";

	        try {
	            Connection con = DriverManager.getConnection(db, username, password);

	            if (con != null) {
	                String sql = "SELECT * FROM info";
	                Statement stmt = con.createStatement();
	                ResultSet rs = stmt.executeQuery(sql);

	                if (rs.next()) {
	                	String employeeId= rs.getString("id");
	                    String employeeName = rs.getString("name");
	                    @SuppressWarnings("unused")
						String employeePosition = rs.getString("position");

	                    id_tf.setText(employeeId);
	                    name_tf.setText(employeeName);
	                    position_tf.setText(employeeName);
	                    
	                } else {
	                    JOptionPane.showMessageDialog(frame, "No data found.");
	                }
	            }

	            con.close();
	        } catch (SQLException e1) {
	            e1.printStackTrace();
			
		}
			

		}

	}

	private void displayEmployeeData(String id, String name, String position) {
		String db = "jdbc:mysql://localhost:3306/SQLite";
        String username = "root";
        String password = "";

        try {
            Connection con = DriverManager.getConnection(db, username, password);

            if (con != null) {
                String sql = "SELECT * FROM info";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                if (rs.next()) {
                	@SuppressWarnings("unused")
					String employeeId= rs.getString("id");
                    @SuppressWarnings("unused")
					String employeeName = rs.getString("name");
                    @SuppressWarnings("unused")
					String employeePosition = rs.getString("position");

                    id_tf.setText(id);
                    name_tf.setText(name);
                    position_tf.setText(position);
                    
                } else {
                    JOptionPane.showMessageDialog(frame, "No data found.");
                }
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
		
	}}}
