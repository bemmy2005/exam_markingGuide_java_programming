package questionone;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import questionthree.TeacherApplet;
public class GUIEmployee {
	//Database integration
		private static final String URL = "jdbc:mysql://localhost:3306/library";
		private static final String USER = "root";
		private static final String PASSWORD = "";
		//
		private JFrame frame;
		//labels
		private JLabel id_lb=new JLabel("ID");
		private JLabel name_lb=new JLabel("NAME");
		private JLabel position_lb=new JLabel("POSITION");
		
		//text fields
		private JTextField id_tf =new JTextField("");
		private JLabel name_tf=new JLabel("");
		private JLabel position_tf=new JLabel("");
		//Buttons
		private JButton insert_btn=new JButton("Insert");
		private JButton view_btn=new JButton("View");
		private JButton update_btn=new JButton("Update");
		private JButton delete_btn=new JButton("Delete");

		//constructor
		public GUIEmployee(){
			createWindow();
			setLocationAndSize();
			addActionEvent();
			addComponentsToFrame();
		}

		private void addComponentsToFrame() {
			frame.add(id_lb);
			frame.add(name_lb);
			frame.add(position_lb);
			frame.add(insert_btn);
			frame.add(update_btn);
			frame.add(view_btn);
			frame.add(delete_btn);
			frame.add(id_tf);
			frame.add(name_tf);
			frame.add(position_tf);
			


		}

		private void addActionEvent() {
			insert_btn.addComponentListener((ComponentListener) this);
			view_btn.addComponentListener((ComponentListener) this);
			update_btn.addComponentListener((ComponentListener) this);
			delete_btn.addComponentListener((ComponentListener) this);
		}

		private void setLocationAndSize() {
			id_lb.setBounds(10,10,80,25);
			name_lb.setBounds(10,40,80,25);
			insert_btn.setBounds(10,200,80,25);
			update_btn.setBounds(190,200,80,25);
			view_btn.setBounds(100,200,80,25);
			delete_btn.setBounds(280,200,80,25);
			id_tf.setBounds(160,10,200,25);
			name_tf.setBounds(160,40,200,25);
			position_tf.setBounds(160,70,200,25);
		}

		private void createWindow() {
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
				createApplet();
			} else if (e.getSource() == view_btn) {
				readBook();
			} else if (e.getSource() == update_btn) {
				updateBook();
			} else if (e.getSource() == delete_btn) {
				deleteApplet();
			}
		}

		private Connection getConnection() throws SQLException {
			return DriverManager.getConnection(URL, USER, PASSWORD);
		}

		private void createApplet() {
			try (Connection conn = getConnection()) {
				String query = "INSERT INTO applet(title, description, authors, number_of_chapters, number_of_pages) VALUES (?, ?, ?, ?, ?)";
				PreparedStatement stmt = conn.prepareStatement(query);
				stmt.setString(1, name_tf.getText());
				stmt.setString(2, position_tf.getText());
				JOptionPane.showInputDialog(this, "Applet created successfully!");
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}

		private void readBook() {
			try (Connection conn = getConnection()) {
				String query = "SELECT * FROM applet WHERE id = ?";
				PreparedStatement stmt = conn.prepareStatement(query);
				stmt.setInt(1, Integer.parseInt(id_tf.getText()));
				stmt.setString(2, position_tf.getText());
				ResultSet rs = stmt.executeQuery();
				if (rs.next()) {
					name_tf.setText(rs.getString("name"));
					
				} else {
					JOptionPane.showInputDialog(this, "Applet not found!");
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}

		private void updateBook() {
			try (Connection conn = getConnection()) {
				String query = "UPDATE book SET title = ?, description = ?, authors = ?, number_of_chapters = ?, number_of_pages = ? WHERE id = ?";
				PreparedStatement stmt = conn.prepareStatement(query);
				stmt.setString(1, name_tf.getText());
				stmt.setString(2, position_tf.getText());
				stmt.setInt(3, Integer.parseInt(id_tf.getText()));
				stmt.executeUpdate();
				JOptionPane.showInputDialog(this, "Applet updated successfully!");
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}

		private void deleteApplet() {
			try (Connection conn = getConnection()) {
				String query = "DELETE FROM applet WHERE id = ?";
				PreparedStatement stmt = conn.prepareStatement(query);
				stmt.setInt(1, Integer.parseInt(id_tf.getText()));
				stmt.setString(2, position_tf.getText());
				stmt.executeUpdate();
				JOptionPane.showInputDialog(this, "Applet deleted successfully!");
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}

		public static void main(String[] args){
			TeacherApplet bf=new TeacherApplet();
		}
		


	}


