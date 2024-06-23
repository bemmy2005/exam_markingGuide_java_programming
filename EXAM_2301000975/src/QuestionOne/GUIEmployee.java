//Nyirabaziga ituze merveille 2301000975


package QuestionOne;

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
    private Connection conn;

    public GUIEmployee() {
        super("Employee Records");

        // label
        idField = new JTextField(10);
        nameField = new JTextField(10);
        
        //textfield
        positionField = new JTextField(10);
        
        //button
        insertButton = new JButton("Insert");
        viewButton = new JButton("View");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");

        // Set layout
        setLayout(new GridLayout(6, 2));
        //label
        add(new JLabel("ID:"));
        add(new JLabel("Name:"));
        add(new JLabel("Position:"));
        //field
        add(idField);
        add(nameField);
        add(positionField);
        
        
        
        //button
        add(insertButton);
        add(viewButton);
        add(updateButton);
        add(deleteButton);

        // Connect to database
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "username", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Button actions
        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                insertRecord();
            }
        });

        viewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewRecord();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateRecord();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteRecord();
            }
        });

        // Set frame properties
        setSize(400, 240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void insertRecord() {
        try {
            String query = "INSERT INTO employee (id, name, position) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(idField.getText()));
            pstmt.setString(2, nameField.getText());
            pstmt.setString(3, positionField.getText());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void viewRecord() {
        try {
            String query = "SELECT * FROM employee WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(idField.getText()));
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                nameField.setText(rs.getString("name"));
                positionField.setText(rs.getString("position"));
            } else {
                JOptionPane.showMessageDialog(this, "Record not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void updateRecord() {
        try {
            String query = "UPDATE employee SET name = ?, position = ? WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, nameField.getText());
            pstmt.setString(2, positionField.getText());
            pstmt.setInt(3, Integer.parseInt(idField.getText()));
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Record updated successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Record not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void deleteRecord() {
        try {
            String query = "DELETE FROM employee WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(idField.getText()));
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(this, "Record deleted successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Record not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUIEmployee();
            }
        });
    }
}