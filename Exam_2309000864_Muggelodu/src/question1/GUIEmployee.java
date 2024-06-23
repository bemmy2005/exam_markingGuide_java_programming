package question1;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.sql.*;

	public class GUIEmployee extends JFrame implements ActionListener {

	   
	    JLabel idLabel = new JLabel("ID:");
	    JLabel nameLabel = new JLabel("Name:");
	    JLabel positionLabel = new JLabel("Position:");


	    JTextField idField = new JTextField();
	    JTextField nameField = new JTextField();
	    JTextField positionField = new JTextField();


	    JButton insertButton = new JButton("Insert");
	    JButton viewButton = new JButton("View");
	    JButton updateButton = new JButton("Update");
	    JButton deleteButton = new JButton("Delete");

	    public GUIEmployee() {
	        createWindow();
	        setLocationAndSize();
	        addComponentsToTheWindow();
	        addActionEvent();
	    }

	    private void createWindow() {
	        setTitle("Employee Management");
	        setBounds(100, 100, 400, 300);
	        getContentPane().setLayout(null);
	        setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setResizable(false);
	        getContentPane().setBackground(Color.lightGray);
	    }

	    private void setLocationAndSize() {
	        idLabel.setBounds(20, 20, 100, 30);
	        nameLabel.setBounds(20, 70, 100, 30);
	        positionLabel.setBounds(20, 120, 100, 30);

	        idField.setBounds(130, 20, 200, 30);
	        nameField.setBounds(130, 70, 200, 30);
	        positionField.setBounds(130, 120, 200, 30);

	        insertButton.setBounds(20, 170, 80, 30);
	        viewButton.setBounds(110, 170, 80, 30);
	        updateButton.setBounds(200, 170, 80, 30);
	        deleteButton.setBounds(290, 170, 80, 30);
	    }

	    private void addComponentsToTheWindow() {
	        add(idLabel);
	        add(nameLabel);
	        add(positionLabel);

	        add(idField);
	        add(nameField);
	        add(positionField);

	        add(insertButton);
	        add(viewButton);
	        add(updateButton);
	        add(deleteButton);
	    }

	    private void addActionEvent() {
	        insertButton.addActionListener(this);
	        viewButton.addActionListener(this);
	        updateButton.addActionListener(this);
	        deleteButton.addActionListener(this);
	    }

	    public static void main(String[] args) {
	        new GUIEmployee();
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == insertButton) {
	            insertEmployee();
	        } else if (e.getSource() == viewButton) {
	            viewEmployee();
	        } else if (e.getSource() == updateButton) {
	            updateEmployee();
	        } else if (e.getSource() == deleteButton) {
	            deleteEmployee();
	        }
	    }

	    private Connection getConnection() throws SQLException {
	        String dbUrl = "jdbc:mysql://localhost:3306/exam";
	        String dbUsername = "root";
	        String dbPassword = "";
	        return DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
	    }

	    private void insertEmployee() {
	        Employee employee = new Employee();
	        employee.setId(Integer.parseInt(idField.getText()));
	        employee.setName(nameField.getText());
	        employee.setPosition(positionField.getText());

	        String sql = "INSERT INTO employee (id, name, position) VALUES (?, ?, ?)";

	        try (Connection con = getConnection();
	             PreparedStatement pstmt = con.prepareStatement(sql)) {
	            pstmt.setInt(1, employee.getId());
	            pstmt.setString(2, employee.getName());
	            pstmt.setString(3, employee.getPosition());
	            pstmt.executeUpdate();
	            JOptionPane.showMessageDialog(this, "Employee Inserted Successfully!");
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	            JOptionPane.showMessageDialog(this, "Error inserting employee!");
	        }
	    }

	    private void viewEmployee() {
	        int id = Integer.parseInt(idField.getText());

	        String sql = "SELECT * FROM employee WHERE id = ?";

	        try (Connection con = getConnection();
	             PreparedStatement pstmt = con.prepareStatement(sql)) {
	            pstmt.setInt(1, id);
	            ResultSet rs = pstmt.executeQuery();

	            if (rs.next()) {
	                nameField.setText(rs.getString("name"));
	                positionField.setText(rs.getString("position"));
	            } else {
	                JOptionPane.showMessageDialog(this, "Employee not found!");
	            }
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	            JOptionPane.showMessageDialog(this, "Error viewing employee!");
	        }
	    }

	    private void updateEmployee() {
	        Employee employee = new Employee();
	        employee.setId(Integer.parseInt(idField.getText()));
	        employee.setName(nameField.getText());
	        employee.setPosition(positionField.getText());

	        String sql = "UPDATE employee SET name = ?, position = ? WHERE id = ?";

	        try (Connection con = getConnection();
	             PreparedStatement pstmt = con.prepareStatement(sql)) {
	            pstmt.setString(1, employee.getName());
	            pstmt.setString(2, employee.getPosition());
	            pstmt.setInt(3, employee.getId());
	            pstmt.executeUpdate();
	            JOptionPane.showMessageDialog(this, "Employee Updated Successfully!");
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	            JOptionPane.showMessageDialog(this, "Error updating employee!");
	        }
	    }

	    private void deleteEmployee() {
	        int id = Integer.parseInt(idField.getText());

	        String sql = "DELETE FROM employee WHERE id = ?";

	        try (Connection con = getConnection();
	             PreparedStatement pstmt = con.prepareStatement(sql)) {
	            pstmt.setInt(1, id);
	            pstmt.executeUpdate();
	            JOptionPane.showMessageDialog(this, "Employee Deleted Successfully!");
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	            JOptionPane.showMessageDialog(this, "Error deleting employee!");
	        }
	    }
	}


