package question.one;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

public class GUIEmployee extends JFrame {
	private JTextField idField, nameField, positionField;
	private JButton insertButton, viewButton, updateButton, deleteButton;

	public GUIEmployee() {
		setTitle("Employee Management");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(5, 2));

		JLabel idLabel = new JLabel("ID:");
		idField = new JTextField();
		JLabel nameLabel = new JLabel("Name:");
		nameField = new JTextField();
		JLabel positionLabel = new JLabel("Position:");
		positionField = new JTextField();

		insertButton = new JButton("Insert");
		viewButton = new JButton("View");
		updateButton = new JButton("Update");
		deleteButton = new JButton("Delete");

		add(idLabel);
		add(idField);
		add(nameLabel);
		add(nameField);
		add(positionLabel);
		add(positionField);
		add(insertButton);
		add(viewButton);
		add(updateButton);
		add(deleteButton);

		// Database connection
		Connection connection = connectToDatabase();

		// Add action listeners for buttons
		insertButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				insertRecord(connection);
			}
		});

		viewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				viewRecord(connection);
			}
		});

		updateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateRecord(connection);
			}
		});

		deleteButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteRecord(connection);
			}
		});

		setVisible(true);
	}

	private Connection connectToDatabase() {
		try {
			return DriverManager.getConnection("jdbc:sqlite:employees.db");
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	private void insertRecord(Connection connection) {
		try {
			String query = "INSERT INTO employees (id, name, position) VALUES (?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, Integer.parseInt(idField.getText()));
			statement.setString(2, nameField.getText());
			statement.setString(3, positionField.getText());
			statement.executeUpdate();
			JOptionPane.showMessageDialog(this, "Record Inserted Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void viewRecord(Connection connection) {
		try {
			String query = "SELECT * FROM employees WHERE id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, Integer.parseInt(idField.getText()));
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				nameField.setText(resultSet.getString("name"));
				positionField.setText(resultSet.getString("position"));
			} else {
				JOptionPane.showMessageDialog(this, "Record Not Found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void updateRecord(Connection connection) {
		try {
			String query = "UPDATE employees SET name = ?, position = ? WHERE id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, nameField.getText());
			statement.setString(2, positionField.getText());
			statement.setInt(3, Integer.parseInt(idField.getText()));
			statement.executeUpdate();
			JOptionPane.showMessageDialog(this, "Record Updated Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void deleteRecord(Connection connection) {
		try {
			String query = "DELETE FROM employees WHERE id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, Integer.parseInt(idField.getText()));
			statement.executeUpdate();
			JOptionPane.showMessageDialog(this, "Record Deleted Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new GUIEmployee();
	}
}
