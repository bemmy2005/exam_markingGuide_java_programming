package question.three;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class TeacherApplet extends Applet implements ActionListener {
	Label lblId, lblName, lblSubject;
	TextField txtId, txtName, txtSubject;
	Button btnInsert, btnView, btnUpdate, btnDelete;
	Connection con;

	public void init() {
		// Labels and TextFields
		lblId = new Label("ID:");
		lblName = new Label("Name:");
		lblSubject = new Label("Subject:");

		txtId = new TextField(20);
		txtName = new TextField(20);
		txtSubject = new TextField(20);

		// Buttons
		btnInsert = new Button("Insert");
		btnView = new Button("View");
		btnUpdate = new Button("Update");
		btnDelete = new Button("Delete");

		// Add components to the applet
		setLayout(new GridLayout(5, 2));
		add(lblId);
		add(txtId);
		add(lblName);
		add(txtName);
		add(lblSubject);
		add(txtSubject);
		add(btnInsert);
		add(btnView);
		add(btnUpdate);
		add(btnDelete);

		// Add action listeners to the buttons
		btnInsert.addActionListener(this);
		btnView.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnDelete.addActionListener(this);

		// Database connection
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teacherDB", "root", "password");
		} catch (Exception e) {
			System.out.println("Database connection error: " + e);
		}
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btnInsert) {
			insertTeacher();
		} else if (ae.getSource() == btnView) {
			viewTeacher();
		} else if (ae.getSource() == btnUpdate) {
			updateTeacher();
		} else if (ae.getSource() == btnDelete) {
			deleteTeacher();
		}
	}

	private void insertTeacher() {
		try {
			String query = "INSERT INTO teachers (id, name, subject) VALUES (?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(txtId.getText()));
			pstmt.setString(2, txtName.getText());
			pstmt.setString(3, txtSubject.getText());
			pstmt.executeUpdate();
			System.out.println("Record inserted successfully");
		} catch (Exception e) {
			System.out.println("Insertion error: " + e);
		}
	}

	private void viewTeacher() {
		try {
			String query = "SELECT * FROM teachers WHERE id = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(txtId.getText()));
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				txtName.setText(rs.getString("name"));
				txtSubject.setText(rs.getString("subject"));
				System.out.println("Record retrieved successfully");
			} else {
				System.out.println("Record not found");
			}
		} catch (Exception e) {
			System.out.println("View error: " + e);
		}
	}

	private void updateTeacher() {
		try {
			String query = "UPDATE teachers SET name = ?, subject = ? WHERE id = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, txtName.getText());
			pstmt.setString(2, txtSubject.getText());
			pstmt.setInt(3, Integer.parseInt(txtId.getText()));
			pstmt.executeUpdate();
			System.out.println("Record updated successfully");
		} catch (Exception e) {
			System.out.println("Update error: " + e);
		}
	}

	private void deleteTeacher() {
		try {
			String query = "DELETE FROM teachers WHERE id = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(txtId.getText()));
			pstmt.executeUpdate();
			System.out.println("Record deleted successfully");
		} catch (Exception e) {
			System.out.println("Deletion error: " + e);
		}
	}
}

